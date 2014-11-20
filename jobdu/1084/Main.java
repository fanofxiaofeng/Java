import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final int n = 1000000;
        final int limit =1000000000;
        int[] record = new int[n + 1];
        record[1] = 1;
        record[2] = 2;
        for(int i = 3;i <= n;i++){
            if(i % 2 == 0){
                record[i] = record[i - 2] + record[i / 2];
                if(record[i] >= limit)
                    record[i] %= limit;
            } else {
                record[i] = record[i - 1];
            }
        }

        while(in.hasNext()){
            int temp = in.nextInt();

            System.out.println(record[temp]);
        }
    }
}
