import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[][] table = new int[n][n];
        for(int row = 0;row < n;row++){
            for(int col = 0;col < n;col++)
                table[row][col] = in.nextInt();
        }

        int cnt = 0;
        for(int sum = 0;sum <= 2 * n - 2;sum++){
            int row = (sum >= n)?(n - 1):sum;
            for(int col = sum - row;row >= 0 && col < n;row--, col++){
                cnt++;
                if(cnt != n * n)
                    System.out.print(table[row][col] + " ");
                else
                    System.out.println(table[row][col]);
            }
        }
	}
}
