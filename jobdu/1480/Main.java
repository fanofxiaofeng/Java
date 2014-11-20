import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();
            int[] data = new int[n];
            int[] record = new int[n];
            for(int i = 0;i < n;i++)
                data[i] = in.nextInt();

            System.out.println(f(n, data, record));
        }
    }

    private static int f(int n, int[] data, int[] record){
        int opt = -1;
        for(int i = 0;i < n;i++){
            int temp = data[i];
            for(int j = 0;j < i;j++){
                if(data[j] < data[i] && record[j] + data[i] > temp){
                    temp = record[j] + data[i];
                }
            }
            record[i] = temp;
        }

        for(int i = 0;i < n;i++){
            if(record[i] > opt)
                opt = record[i];
        }

        return opt;
    }
}
