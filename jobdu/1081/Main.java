import java.util.*;

public class Main{
    private static final int num = 10000;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int a0 = in.nextInt();
            int a1 = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            int k = in.nextInt();

            System.out.println(f(a0 % num, a1 % num, p % num, q % num, k));
        }
    }

    private static int f(int a0, int a1, int p, int q, int k){
        if(k == 0)
            return a0 % num;
        if(k == 1)
            return a1 % num;
        if(k == 2)
            return (p * a1 + q * a0) % num;

        int[][] temp = new int[2][2];
        temp[0][0] = p;
        temp[0][1] = 1;
        temp[1][0] = q;
        temp[1][1] = 0;

        int[][] matrix = calc(temp, k - 1);
        int result = a1 * matrix[0][0] + a0 * matrix[1][0];

        return result % num;
    }

    private static int[][] calc(int[][] m, int k){
        int[][] result = new int[2][2];
        if(k == 1){
            for(int row = 0;row < 2;row++){
                for(int col = 0;col < 2;col++)
                    result[row][col] = m[row][col];
            }
            return result;
        }
        int[][] temp = calc(m, k / 2);
        temp = matrixMultiply(temp, temp);
        if(k % 2 == 1)
            temp = matrixMultiply(temp, m);
        return temp;
    }

    private static int[][] matrixMultiply(int[][] a, int[][] b){
        int[][] result = new int[2][2];
        for(int row = 0;row < 2;row++){
            for(int col = 0;col < 2;col++){
                int temp = 0;
                for(int i = 0;i < 2;i++)
                    temp += a[row][i] * b[i][col];
                result[row][col] = temp % num;
            }
        }
        return result;
    }
}
