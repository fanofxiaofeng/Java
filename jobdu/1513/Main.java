import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i = 0;i < n;i++){
            long temp = in.nextLong();
            System.out.println(f(temp));
        }
    }

    private static int f(long a){
        if(a < 0)
            return f(a + 0x100000000L);

        if(a == 0)
            return 0;
        else
            return (int)(a % 2) + f(a / 2);
    }
}
