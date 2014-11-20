import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 10;
        long[] cntWithDigitsLe = new long[n];
        cntWithDigitsLe[1] = 1L;
        long temp = 10;
        for(int i = 2;i < n;i++){
            cntWithDigitsLe[i] = temp + 10L * cntWithDigitsLe[i - 1];
            temp *= 10L;
        }
        /*
        for(int i = 1;i < n;i++)
            System.out.println(i + ": " + cntWithDigitsLe[i]);
        */
        while(in.hasNext()){
            long a = in.nextLong();
            long b = in.nextLong();
            if(a == 0 || b == 0)
                System.out.println(calc(a + b, cntWithDigitsLe));
            else
                System.out.println(calc(Math.max(a, b), cntWithDigitsLe) - calc(Math.min(a, b) - 1, cntWithDigitsLe));
        }
    }

    private static long calc(long n, long[] cntWithDigitsLe){
        if(n < 10)
            return (n == 0)?0L:1L;

        long temp = 1L;
        int digitsCnt = 1;
        while(n >= temp * 10L){
            temp *= 10L;
            digitsCnt++;
        }
        // System.out.println("temp: " + temp);
        // System.out.println("digitsCnt: " + digitsCnt);
        long result = n / temp * cntWithDigitsLe[digitsCnt - 1];
        if(n / temp == 1)
            result += n - temp + 1;
        else
            result += temp;

        result += calc(n % temp, cntWithDigitsLe);

        return result;
    }
}
