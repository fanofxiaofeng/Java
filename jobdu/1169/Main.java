import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            int cntEven = 0;
            int cntOdd = 0;
            for(int i = 0;i < n;i++){
                int temp = in.nextInt();
                if(temp % 2 == 0)
                    cntEven++;
                else
                    cntOdd++;
            }
            if(cntEven > cntOdd)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
