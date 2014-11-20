import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(f(n - 1, m - 1));
    }

    private static int f(int n, int m){
        int d = gcd(n, m);
        return d * (n / d - 1 + m / d - 1 + 1);
    }

    private static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
