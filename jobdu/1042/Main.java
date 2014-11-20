import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.next();
            String s2 = in.next();

            int[][] table = new int[s1.length() + 1][s2.length() + 1];

            for(int row = 1;row <= s1.length();row++){
                char c1 = s1.charAt(row - 1);

                for(int col = 1;col <= s2.length();col++){
                    char c2 = s2.charAt(col - 1);

                    if(c1 == c2)
                        table[row][col] = table[row - 1][col - 1] + 1;
                    else
                        table[row][col] = Math.max(table[row - 1][col], table[row][col - 1]);
                }
            }
            System.out.println(table[s1.length()][s2.length()]);
        }
    }
}
