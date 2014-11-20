import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 91;
        long[] data = new long[n];
        data[1] = 1L;
        data[2] = 2L;
        for(int i = 3;i < n;i++)
            data[i] = data[i - 1] + data[i - 2];
        while(in.hasNext()){
            int temp = in.nextInt();
            System.out.println(data[temp]);
        }
    }
}

