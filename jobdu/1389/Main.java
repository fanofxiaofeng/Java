import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int len = 51;

        long[] data = new long[len];
        long[] acc = new long[len];

        data[1] = 1L;
        acc[1] = 1L;

        for(int i = 2;i < len;i++){
            data[i] = acc[i - 1] + 1L;
            acc[i] = acc[i - 1] + data[i];
        }
        while(in.hasNext()){
            int temp = in.nextInt();
            System.out.println(data[temp]);
        }
    }
}
