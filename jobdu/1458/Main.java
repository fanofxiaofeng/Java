import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 36;
        long[] data = new long[n];
        data[1] = 2L;

        for(int i = 2;i < n;i++)
            data[i] = 3L * data[i - 1] + 2L;

        while(in.hasNext()){
            int temp = in.nextInt();
            System.out.println(data[temp]);
        }
    }
}
