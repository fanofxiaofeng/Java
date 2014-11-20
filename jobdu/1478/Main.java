import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] data = new int[3];
        while(true){
            for(int i = 0;i < 3;i++)
                data[i] = in.nextInt();
            if(data[0] == 0)
                break;
            Arrays.sort(data);

            System.out.println(data[0] + data[1] - data[2]);
        }
    }
}
