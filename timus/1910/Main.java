import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] data = new int[n + 1];
        for(int i = 1;i <= n;i++)
            data[i] = in.nextInt();

        int sum = data[1] + data[2] + data[3];
        int opt = sum;
        int pos = 2;
        for(int middle = 3;middle < n;middle++){
            sum += data[middle + 1] - data[middle - 2];

            if(sum > opt){
                opt = sum;
                pos = middle;
            }
        }
        System.out.println(opt + " " + pos);
    }
}

