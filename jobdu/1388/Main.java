import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int len = 71;
        long[] data = new long[len];
        data[0] = 0L;
        data[1] = 1L;
        data[2] = 2L;
        for(int i = 3;i < len;i++)
            data[i] = data[i - 1] + data[i - 2];

        while(in.hasNext()){
            int temp = in.nextInt();
            System.out.println(data[temp]);
        }
    }
}
