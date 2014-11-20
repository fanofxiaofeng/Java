import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a * b / gcd(a, b));
        }
    }

    private static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
