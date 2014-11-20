import java.util.*;

public class Main{
    private static int[] rowDelta = new int[8];
    private static int[] colDelta = new int[8];

	public static void main(String[] args){
        int pos = 0;
        final int squareSum = 5;
        for(int row = -2;row <= 2;row++){
            for(int col = -2;col <= 2;col++){
                if(row * row + col * col == squareSum){
                    rowDelta[pos] = row;
                    colDelta[pos] = col;
                    pos++;
                }
            }
        }

		Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String from = in.next();
            String to = in.next();

            final int size = 8;
            int[][] matrix = new int[size][size];
            for(int row = 0;row < size;row++){
                for(int col = 0;col < size;col++)
                    matrix[row][col] = -1;
            }

            int r1 = from.charAt(0) - 'a';
            int c1 = from.charAt(1) - '1';

            int r2 = to.charAt(0) - 'a';
            int c2 = to.charAt(1) - '1';

            matrix[r1][c1] = 0;
            Queue<Integer> rowQ = new LinkedList<Integer>();
            Queue<Integer> colQ = new LinkedList<Integer>();
            rowQ.offer(r1);
            colQ.offer(c1);

            while(matrix[r2][c2] < 0){
                r1 = rowQ.poll();
                c1 = colQ.poll();
                int step = matrix[r1][c1];
                for(int i = 0;i < rowDelta.length;i++){
                    if(isValid(r1 + rowDelta[i], c1 + colDelta[i], size) && matrix[r1 + rowDelta[i]][c1 + colDelta[i]] < 0){
                        rowQ.offer(r1 + rowDelta[i]);
                        colQ.offer(c1 + colDelta[i]);
                        matrix[r1 + rowDelta[i]][c1 + colDelta[i]] = step + 1;
                    }
                }
            }
            System.out.println("To get from " + from + " to " + to + " takes " + matrix[r2][c2] + " knight moves.");
        }
	}

	private static boolean isValid(int r, int c, int size){
        return (r >= 0 && r < size) && (c >= 0 && c < size);
	}
}
