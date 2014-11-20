import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int v = 1;
        int sum = 0;
        for(int i = s.length() - 1;i >= 0;i--){
            char c = s.charAt(i);
            int delta = (int)(c - '0');
            sum += v * delta;
            v = 10 * v % 7;
        }
        System.out.println(sum % 7);
    }
}
