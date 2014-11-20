import java.util.*;
import java.math.BigInteger;

public class Main{
    private static final int n = 1000;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true){
            int a = in.nextInt();
            int b = in.nextInt();
            if(a == 0 && b == 0)
                break;
            System.out.println(f(a, b));
        }
    }

    private static int f(int a, int b){
        a %= n;
        if(b == 1 || b == 0)
            return (b == 1)?a:(1);

        int temp = f(a, b / 2);
        if(b % 2 == 0)
            return (temp * temp) % n;
        else
            return (temp * temp * a) % n;
    }
}
