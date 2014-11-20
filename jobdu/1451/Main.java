import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Smart s = new Smart();
        while(in.hasNext()){
            int temp = in.nextInt();
            System.out.println(s.calc(temp));
        }
    }
}

class Smart{
    private final long n = 21L;
    private long[] factorial = new long[(int)n];

    Smart(){
        factorial[0] = 1L;
        for(long i = 1L;i < n;i++)
            factorial[(int)i] = factorial[(int)(i - 1)] * i;
    }

    public long calc(int num){
        long result = 0;
        for(int i = 1;i <= num;i++){
            long temp = factorial[num] / factorial[i];
            if(i % 2 == 1)
                result += temp;
            else
                result -= temp;
        }
        return factorial[num] - result;
    }
};
