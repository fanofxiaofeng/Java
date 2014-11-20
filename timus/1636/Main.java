import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t1 = in.nextInt();
        int t2 = in.nextInt();

        final int n = 10;
        int total = 0;
        for(int i = 0;i < n;i++){
            int temp = in.nextInt();
            total += temp;
        }

        total *= 20;
        if(t2 - total < t1)
            System.out.println("Dirty debug :(");
        else
            System.out.println("No chance.");
    }
}
