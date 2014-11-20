import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int enough = 31;
        long[] a = new long[enough];
        a[1] = 1L;
        for(int i = 2;i < enough;i++)
            a[i] = a[i - 1] + a[i - 2];
        while(in.hasNext()){
            int n = in.nextInt();
            System.out.println(a[n]);
        }
    }
}
