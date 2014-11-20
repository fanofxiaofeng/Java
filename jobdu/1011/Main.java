import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            if(n == 0)
                break;

            int[] data = new int[n];
            int[] sum = new int[n];
            int[] minSumSeen = new int[n];
            int[] pre = new int[n];

            for(int i = 0;i < n;i++)
                data[i] = in.nextInt();

            sum[0] = data[0];
            for(int i = 1;i < n;i++)
                sum[i] = sum[i - 1] + data[i];

            minSumSeen[0] = 0;
            pre[0] = -1;
            for(int i = 1;i < n;i++){
                if((sum[i - 1] < minSumSeen[i - 1])){
                    minSumSeen[i] = sum[i - 1];
                    pre[i] = i - 1;
                } else {
                    minSumSeen[i] = minSumSeen[i - 1];
                    pre[i] = pre[i - 1];
                }
            }

            // int opt = data[0];
            int headPos = 0;
            int tailPos = 0;

            int opt = sum[0];
            for(int i = 1;i < n;i++){
                if(sum[i] - minSumSeen[i] > opt){
                    opt = sum[i] - minSumSeen[i];
                    headPos = pre[i] + 1;
                    tailPos = i;
                }
            }

            if(opt < 0){
                System.out.println("0 " + data[0] + " " + data[data.length - 1]);
                return;
            }
            // System.out.println("sum array: " + Arrays.toString(sum));
            // System.out.println("min array: " + Arrays.toString(minSumSeen));
            System.out.println(opt + " " + data[headPos] + " " + data[tailPos]);
        }
    }
}
