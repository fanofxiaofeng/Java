import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int y = in.nextInt();
            int m = in.nextInt();
            int d = in.nextInt();
            int total = 0;
            for(int i = 1;i < m;i++)
                total += Convertor(y, i);
            total += d;
            System.out.println(total);
        }
    }
    public static int Convertor(int y, int m){
        if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            return 31;
        else if(m == 2)
            return 28 + ((isLeapYear(y))?1:0);
        else
            return 30;
    }

    public static boolean isLeapYear(int y){
        if(y % 400 == 0)
            return true;
        else if(y % 100 == 0)
            return false;
        else
            return y % 4 == 0;
    }
}
