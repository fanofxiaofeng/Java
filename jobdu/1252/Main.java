import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String s = in.next();
            System.out.println(f(s));
        }
    }

    private static int f(String s){
        char[] cs = new char[2 * s.length() + 3];

        // fill cs[]
        for(int i = 0;i < cs.length;i++)
            cs[i] = '_';
        cs[0] = '^';
        cs[cs.length - 1] = '$';
        for(int i = 0;i < s.length();i++)
            cs[2 * i + 2] = s.charAt(i);

        // check whether it is right
        // System.out.println(String.valueOf(cs));

        // calculation
        int farthest = 1;
        int withAxis = 1;
        int[] rs = new int[cs.length];// deltas
        rs[1] = 1;

        for(int i = 2;cs[i] != '$';i++){
            int tempAxis = i;
            int delta = 0;

            if(tempAxis <= farthest)
                delta = Math.min(farthest - tempAxis, rs[2 * withAxis - tempAxis]);

            while(cs[tempAxis + delta] == cs[tempAxis - delta])
                delta++;
            rs[i] = delta - 1;
            if(tempAxis + delta - 1 >= farthest){
                farthest = tempAxis + delta - 1;
                withAxis = tempAxis;
            }
        }
        int opt = -1;
        for(int i = 1;cs[i] != '$';i++){
            if(rs[i] > opt)
                opt = rs[i];
        }

        return opt;
    }
}

