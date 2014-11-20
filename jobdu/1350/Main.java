import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            int[] left = new int[n + 1];
            int[] right = new int[n + 1];
            int[] depth = new int[n + 1];

            for(int i = 1;i <= n;i++){
                int l = in.nextInt();
                int r = in.nextInt();
                left[i] = l;
                right[i] = r;
            }

            int result = -1;
            for(int i = 1;i <= n;i++){
                calc(depth, left, right, i);
                if(depth[i] > result)
                    result = depth[i];
            }
            System.out.println(result);
        }
    }

    private static int calc(int[] depth, int[] left, int[] right, int i){
        if(depth[i] != 0)// already calculated
            return depth[i];

        int leftDepth = 0;
        if(left[i] != -1)
            leftDepth = calc(depth, left, right, left[i]);

        int rightDepth = 0;
        if(right[i] != -1)
            rightDepth = calc(depth, left, right, right[i]);

        depth[i] = Math.max(leftDepth, rightDepth) + 1;
        return depth[i];
    }
}
