import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] s = new int[2];

        for(int i = 0;i < n;i++){
            for(int j = 0;j < 2;j++){
                int temp = in.nextInt();
                s[j] += temp;
            }
        }

        s[0] += k;
        if(s[0] - 2 * (n + 1) - s[1] >= 0)
            System.out.println(s[0] - 2 * (n + 1) - s[1]);
        else
            System.out.println("Big Bang!");
    }
}
