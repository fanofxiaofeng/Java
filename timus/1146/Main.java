import java.util.Scanner;

public class Main{
    private static int safeCalc(int[][] acc, int row, int col){
        if(row < 0 || col < 0)
            return 0;
        else
            return acc[row][col];
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] data = new int[n][n];
        int[][] acc = new int[n][n];
        for(int row = 0;row < n;row++){
            for(int col = 0;col < n;col++){
                data[row][col] = in.nextInt();
                acc[row][col] = data[row][col];
            }
        }

        for(int row = 0;row < n;row++){
            for(int col = 0;col < n;col++)
                acc[row][col] += safeCalc(acc, row - 1, col) + safeCalc(acc, row, col - 1) - safeCalc(acc, row - 1, col - 1);
        }

        int opt = -10 * 10000 * 10000;

        for(int row = 0;row < n;row++){
            for(int col = 0;col < n;col++){
                for(int r = 0;r <= row;r++){
                    for(int c = 0;c <= col;c++){
                        int temp = acc[row][col] - (safeCalc(acc, row, c - 1) + safeCalc(acc, r - 1, col) - safeCalc(acc, r - 1, c - 1));
                        if(temp > opt)
                            opt = temp;
                    }
                }
            }
        }
        System.out.println(opt);
    }
}

