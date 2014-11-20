import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int m = -1;
        int n = -1;
        while(true){
            m = in.nextInt();
            n = in.nextInt();
            if(m == 0 && n == 0)
                break;
            else
                f(m, n);
        }
    }

    private static void f(int m, int n){
        int low = m;
        int high = m;
        int total = 1;

        while(true){
            low = 2 * low;
            high = 2 * high + 1;
            if(n >= high)
                total += high - low + 1;
            else{
                total += (n < low)?0:(n - low + 1);
                break;
            }
        }
        System.out.println(total);
    }
}
