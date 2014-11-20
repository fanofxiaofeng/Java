import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[][] table = new int[n][n];
        int value = 0;
        for(int delta = n - 1;delta > 0;delta--){
            for(int row = 0;row + delta < n;row++)
                table[row][row + delta] = ++value;
        }
        for(int row = 0;row < n;row++)
            table[row][row] = ++value;

        for(int row = 1;row < n;row++){
            for(int col = 0;col < row;col++)
                table[row][col] = n * n + 1 - table[n - 1 - row][n - 1 - col];
        }
        for(int row = 0;row < n;row++){
            for(int col = 0;col < n;col++){
                System.out.print(table[row][col]);
                if(col + 1 != n)
                    System.out.print(" ");
            }
            System.out.println();
        }
	}
}
