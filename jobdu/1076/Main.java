import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 1010;
        BigInteger[] data = new BigInteger[n];
        data[0] = new BigInteger("1");

        for(int i = 1;i < n;i++)
            data[i] = data[i - 1].multiply(new BigInteger("" + i));

        while(in.hasNext()){
            int k = in.nextInt();
            System.out.println(data[k]);
        }
    }
}

