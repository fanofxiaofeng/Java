import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String a = in.next();
            String b = in.next();

            System.out.println(f(a, b));
        }
    }

    private static int f(String a, String b){
        int sum = 0;
        for(int i = 0;i < a.length();i++){
            int v1 = (int)(a.charAt(i) - '0');
            for(int j = 0;j < b.length();j++){
                int v2 = (int)(b.charAt(j) - '0');
                sum += v1 * v2;
            }
        }
        return sum;
    }
}
