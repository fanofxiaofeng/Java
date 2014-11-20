import java.util.*;
import java.math.BigInteger;

public class Main{
    private static final long m =1000000007L;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int len = 1001;
        long[] data = new long[len];
        init(data, len);

        while(in.hasNext()){
            int temp = in.nextInt();
            System.out.println(data[temp]);
        }
    }

    private static void init(long[] data, int len){
        //
        long[] b = new long[len];// end with "b"(boy)
        long[] g = new long[len];// end with "g"(girl)

        b[1] = 1L;
        g[1] = 0L;
        data[1] = 1L;

        b[2] = 1L;
        g[2] = 1L;
        data[2] = 2L;

        b[3] = 2L;
        g[3] = 2L;
        data[3] = 4L;

        for(int i = 4;i < len;i++){
            b[i] = data[i - 1];
            g[i] = b[i - 2];// end with "bgg";
            g[i] = specialPlus(g[i], g[i - 1]);// end with "ggg";
            data[i] = specialPlus(b[i], g[i]);
        }
    }

    private static long specialPlus(long a, long b){
        long s = a + b;
        return (s < m)?(s):(s % m);
    }
}
