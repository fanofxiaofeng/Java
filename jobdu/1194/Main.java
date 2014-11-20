import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            if(n == 0)
                System.out.print("0");
            else
                f(n);
            System.out.println();
        }
    }

    private static void f(int n){
        if(n == 0)
            return;
        f(n / 8);
        System.out.print(n % 8);
    }
}
