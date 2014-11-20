import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int size = 7;

        int[] data = new int[size];
        for(int i = 0;i < size;i++)
            data[i] = in.nextInt();

        for(int i = 0;i < size;i++){
            // change
            data[i] = 1 - data[i];
            if(valid(data))
                break;
            // recover
            data[i] = 1 - data[i];
        }
        for(int i = 0;i < size;i++){
            System.out.print(data[i]);
            if(i + 1 != size)
                System.out.print(" ");
        }
        System.out.println();
    }

    private static boolean valid(int[] A){
        if((A[1] + A[2] + A[3]) % 2 != A[4])
            return false;

        if((A[0] + A[2] + A[3]) % 2 != A[5])
            return false;

        if((A[0] + A[1] + A[3]) % 2 != A[6])
            return false;

        return true;
    }
}
