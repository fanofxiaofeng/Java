import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int big = 210;

        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();

            int[] man = new int[big];
            int[] cnt = new int[big];

            for(int i = 1;i <= n;i++){
                int temp = in.nextInt();
                man[i] = temp;
                cnt[temp]++;
            }
            for(int i = 1;i <= n;i++){
                if(cnt[man[i]] > 1){
                    System.out.println(cnt[man[i]] - 1);
                } else {
                    System.out.println("BeiJu");
                }
            }
        }
    }
}
