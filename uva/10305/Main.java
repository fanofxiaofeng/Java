import java.util.*;

public class Main{
    private static int clock = 0;
    private static List<Integer> nums = new ArrayList<Integer>();

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        while(true){
            clock = 0;
            nums.clear();

            int n = in.nextInt();
            int m = in.nextInt();
            if(n == 0 && m == 0)
                break;

            // get information
            int[][] data = new int[m][2];
            for(int i = 0;i < m;i++){
                for(int j = 0;j < 2;j++)
                    data[i][j] = in.nextInt() - 1;
            }

            // adjacent matrix
            List<List<Integer>> lists = new ArrayList<List<Integer>>();
            for(int i = 0;i < n;i++)
                lists.add(new ArrayList<Integer>());

            for(int i = 0;i < m;i++){
                int from = data[i][0];
                int to = data[i][1];

                lists.get(from).add(to);
            }

            String[] color = new String[n];
            for(int i = 0;i < n;i++)
                color[i] = "white";

            int[] timeStamp = new int[n];
            for(int i = 0;i < n;i++){
                if(color[i].equals("white"))
                    dfs(lists, color, timeStamp,i);
            }

            for(int i = nums.size() - 1;i >= 0;i--)
                System.out.print((nums.get(i) + 1) + ((i > 0)?" ":""));
            System.out.println();
        }
	}

	private static void dfs(List<List<Integer>> lists, String[] color, int[] timeStamp, int i){
	    // System.out.println("dfs called with " + i);
        color[i] = "gray";
        clock++;

        List<Integer> temp = lists.get(i);
        for(int col = 0;col < temp.size();col++){
            if(color[temp.get(col)].equals("white"))
                dfs(lists, color, timeStamp, temp.get(col));
        }

        clock++;
        timeStamp[i] = clock;
        // System.out.println(i + " into array");
        nums.add(i);
        color[i] = "black";
	}
}
