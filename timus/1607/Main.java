import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if(a >= c){
            System.out.println(a);
            return;
        }

        int k = (c - a) / (b + d);
        int peterPrice = a + k * b;
        int driverPrice = c - k * d;
        if(peterPrice + b > driverPrice){
            System.out.println(driverPrice);
            return;
        }
        System.out.println(peterPrice + b);
        return;
    }
}

