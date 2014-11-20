import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        minCut(s);
        System.out.println();
    }

    private static int minCut(String s) {
        // initialization and calculation of array "judge"
        boolean[][] judge = new boolean[s.length()][s.length()];
        for(int delta = 0;delta < s.length();delta++){
            for(int row = 0;row + delta < s.length();row++){
                if(s.charAt(row) == s.charAt(row + delta) && safeJudge(judge, row + 1, row + delta - 1))
                    judge[row][row + delta] = true;
            }
        }

        // initialization and calculation of array "opt"
        int[] opt = new int[s.length()];
        int[] lastPartStart = new int[s.length()];

        for(int i = 0;i < s.length();i++)
            opt[i] = s.length() + 100;

        for(int i = 0;i < s.length();i++){
            if(judge[0][i]){// palindrome
                opt[i] = 1;
                lastPartStart[i] = 0;
            } else {
                for(int j = i;j > 0;j--){
                    if(judge[j][i]){
                        int temp = opt[j - 1] + 1;
                        if(temp < opt[i]){
                            opt[i] = temp;
                            lastPartStart[i] = j;
                        }
                    }
                }
            }
        }
        System.out.println(opt[s.length() - 1]);
        f(opt, lastPartStart, s.length() - 1, s);

        return opt[s.length() - 1];
    }

    private static void f(int[] opt, int[] lastPartStart, int terminal, String s){
        if(opt[terminal] == 1){
            System.out.print(s.substring(0, terminal + 1));
        } else {
            f(opt, lastPartStart, lastPartStart[terminal] - 1, s);
            System.out.print(" ");
            System.out.print(s.substring(lastPartStart[terminal], terminal + 1));
        }
    }

    private static boolean safeJudge(boolean[][] judge, int low, int high){
        if(low > high)
            return true;
        else
            return judge[low][high];
    }
}
