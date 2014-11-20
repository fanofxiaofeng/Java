import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int rubbish = in.nextInt();

        while(in.hasNext()){
            int n = in.nextInt();
            if(n % 2 == 1)
                System.out.println("0 0");
            else
                System.out.println((n + 2) / 4 + " " + (n / 2));
        }
    }
}
