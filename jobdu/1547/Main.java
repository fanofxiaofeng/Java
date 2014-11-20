import java.util.*;
import java.math.BigInteger;

public class Main{
    private static final long m =1000000007;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 1001;
        long[] table = new long[n];
        init(table, n);

        while(in.hasNext()){
            int value = in.nextInt();
            System.out.println(table[value]);
        }
    }

    private static void init(long[] table, int len){
        table[0] = 1L;
        table[2] = 1L;
        for(int i = 4;i < len;i += 2){
            long temp = 0;
            for(int j = 0;j < i;j += 2){
                temp = specialPlus(temp, table[j] * table[i - 2 - j]);
            }
            table[i] = temp;
        }
    }

    private static long specialPlus(long a, long b){
        long s = a + b;
        return (s < m)?s:(s % m);
    }
}
