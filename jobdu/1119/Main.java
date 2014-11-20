import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            BigInteger sum = new BigInteger("0");
            while(true){
                String s = in.next();
                if(s.equals("0"))
                    break;
                sum = sum.add(new BigInteger(s));
            }
            System.out.println(sum);
        }
    }
}
