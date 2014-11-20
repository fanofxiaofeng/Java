import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 8;
        int[][] table = new int[n][n];
        while(in.hasNext()){
            for(int row = 0;row < n;row++){
                for(int col = 0;col < n;col++)
                    table[row][col] = in.nextInt();
            }

            for(int col = 1;col < n;col++)
                table[0][col] += table[0][col - 1];

            for(int row = 1;row < n;row++)
                table[row][0] += table[row - 1][0];

            for(int row = 1;row < n;row++){
                for(int col = 1;col < n;col++)
                    table[row][col] += Math.max(table[row - 1][col], table[row][col - 1]);
            }

            System.out.println(table[n - 1][n - 1]);
        }
    }
}
