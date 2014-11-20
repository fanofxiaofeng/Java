import java.util.*;

public class Main{
    private static char[][] table = new char[40][40];// big enough to hold all values
    private static boolean[][] reachable = new boolean[40][40];
    private static int[] rowDelta = {1, -1, 0, 0};
    private static int[] colDelta = {0, 0, 1, -1};

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int row = 0;row <= n + 1;row++){
            for(int col = 0;col <= n + 1;col++){
                table[row][col] = '#';
            }
        }

        table[0][1] = '.';
        table[1][0] = '.';
        table[n][n + 1] = '.';
        table[n + 1][n] = '.';

        for(int row = 1;row <= n;row++){
            String s = in.next();
            for(int j = 0;j < s.length();j++){
                table[row][j + 1] = s.charAt(j);
            }
        }

        Queue<Integer> rowQ = new LinkedList<Integer>();
        Queue<Integer> colQ = new LinkedList<Integer>();

        rowQ.offer(1);
        colQ.offer(1);
        rowQ.offer(n);
        colQ.offer(n);

        reachable[1][1] = true;
        reachable[n][n] = true;

        while(rowQ.size() != 0){
            int row = rowQ.peek();
            int col = colQ.peek();
            // System.out.println("row: " + row + ", col: " + col);
            rowQ.poll();
            colQ.poll();

            for(int loop = 0;loop < rowDelta.length;loop++){
                int tempRow = row + rowDelta[loop];
                int tempCol = col + colDelta[loop];

                if(inside(tempRow, tempCol, n) && (table[tempRow][tempCol] == '.') && (reachable[tempRow][tempCol] == false)){
                    reachable[tempRow][tempCol] = true;
                    // System.out.println("R: " + tempRow + ", C: " + tempCol);
                    rowQ.offer(tempRow);
                    colQ.offer(tempCol);
                }
            }
        }

        int cnt = 0;
        for(int row = 1;row <= n;row++){
            for(int col = 1;col <= n;col++){
                if(reachable[row][col]){
                    for(int loop = 0;loop < rowDelta.length;loop++){
                        int tempRow = row + rowDelta[loop];
                        int tempCol = col + colDelta[loop];

                        if(table[tempRow][tempCol] == '#')
                            cnt++;
                    }
                }
            }
        }

        System.out.println(cnt * 9);
    }

    private static boolean inside(int row, int col, int n){
        return (row >= 1 && row <= n) && (col >= 1 && col <= n);
    }
}

