import java.util.*;
import java.math.BigInteger;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int value = in.nextInt();
            System.out.println(f(value));
        }
    }

    private static int f(int value){
        int total = 0;
        total += simpleMap(value % 10);
        total += simpleMap((value / 10) % 10);
        total += value / 100;
        return total;
    }

    private static int simpleMap(int v){
        // v >= 0 && v < 10
        if(v == 0)
            return 0;
        if(v == 1 || v == 2 || v == 5)
            return 1;
        if(v == 8 || v == 9)
            return 3;
        else
            return 2;
    }
    // 1: 1
    // 2: 1
    // 3: 2
    // 4: 2
    // 5: 1
    // 6: 2
    // 7: 2
    // 8: 3
    // 9: 3
}
