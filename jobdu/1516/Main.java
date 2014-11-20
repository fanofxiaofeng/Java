import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] data = new int[n];
        int cntEven = 0;
        boolean firstOne = true;
        for(int i = 0;i < n;i++){
            int temp = in.nextInt();
            if(temp % 2 == 1){
                if(firstOne == true){
                    System.out.print(temp);
                    firstOne = false;
                } else {
                    System.out.print(" " + temp);
                }
            } else {
                data[cntEven++] = temp;
            }
        }
        for(int i = 0;i < cntEven;i++){
            if(firstOne == true){
                System.out.print(data[i]);
                firstOne = false;
            } else {
                System.out.print(" " + data[i]);
            }
        }
        System.out.println();
    }
}
