import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String s = in.next();
            BigInteger a = new BigInteger(s);
            s = in.next();
            BigInteger b = new BigInteger(s);
            System.out.println(a.add(b));
            System.out.println(a.add(b.negate()));
            System.out.println(a.multiply(b));
        }

    }
}
