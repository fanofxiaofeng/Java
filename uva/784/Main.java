import java.util.*;
import java.io.*;

public class Main{
    private static int[] rowDelta = {1, -1, 0, 0};
    private static int[] colDelta = {0, 0, 1, -1};

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

        String s = in.nextLine();
        for(int i = 0;i < n;i++){
            List<char[]> maze = new ArrayList<char[]>();
            while(true){
                s = in.nextLine();
                if(s.charAt(0) == '_')
                    break;
                maze.add(s.toCharArray());
            }
            /*
            for(int j = 0;j < maze.size();j++)
                System.out.println(String.valueOf(maze.get(j)));
            */
            int R = -1;
            int C = -1;
            loop:
            for(int row = 0;row < maze.size();row++){
                for(int col = 0;col < maze.get(row).length;col++){
                    if(maze.get(row)[col] == '*'){
                        R = row;
                        C = col;
                        // System.out.println(R + "~" + C);
                        break loop;
                    }
                }
            }

            Queue<Integer> rowQ = new LinkedList<Integer>();
            Queue<Integer> colQ = new LinkedList<Integer>();
            rowQ.offer(R);
            colQ.offer(C);

            while(rowQ.peek() != null){
                R = rowQ.poll();
                C = colQ.poll();
                maze.get(R)[C] = '#';
                for(int loop = 0;loop < rowDelta.length;loop++){
                    if(isValid(R + rowDelta[loop], C + colDelta[loop], maze)){
                        rowQ.offer(R + rowDelta[loop]);
                        colQ.offer(C + colDelta[loop]);
                    }
                }
            }

            for(int j = 0;j < maze.size();j++)
                System.out.println(String.valueOf(maze.get(j)));
            System.out.println(s);
        }
	}

	private static boolean isValid(int row, int col, List<char[]> maze){
        if(row < 0 || row >= maze.size())
            return false;
        if(col < 0 || col >= maze.get(row).length)
            return false;
        return maze.get(row)[col] == ' ';
	}
}
