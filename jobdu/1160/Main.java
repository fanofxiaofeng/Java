import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 11;
        int[][] table = new int[n][n];

        init(table, n);

        int t = in.nextInt();

        for(int i = 0;i < t;i++){
            int a = in.nextInt();
            int p = in.nextInt();
            System.out.println(table[a][p]);
        }
    }

    private static void init(int[][] table, int n){
        for(int plates = 1;plates < n;plates++)
            table[0][plates] = 1;
        for(int apples = 1;apples < n;apples++)
            table[apples][1] = 1;

        for(int apples = 1;apples < n;apples++){
            for(int plates = 2;plates < n;plates++){
                int temp = 0;

                temp += table[apples][plates - 1];
                for(int i = 1;apples - i * plates >= 0;i++){
                    temp += table[apples - i * plates][plates - 1];
                }
                table[apples][plates] = temp;
            }
        }
    }
}
