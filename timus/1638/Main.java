import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(d > c)
            System.out.println((d - c - 1) * a + (d - c) * 2 * b);
        else if(d < c)
            System.out.println((c - d + 1) * a + (c - d) * 2 * b);
        else// d == c
            System.out.println(b);
    }
}

