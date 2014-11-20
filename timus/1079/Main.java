import java.util.*;

public class Main{
    public static void main(String[] args){
        int[] data = new int[100000];
        data[0] = 0;
        data[1] = 1;
        for(int i = 2;i < 100000;i++){
            if(i % 2 == 0)
                data[i] = data[i / 2];
            else
                data[i] = data[i / 2] + data[i - i / 2];
        }

        int[] result = new int[data.length];
        for(int i = 1;i < result.length;i++)
            result[i] = (result[i - 1] >= data[i])?result[i - 1]:data[i];


        Scanner in = new Scanner(System.in);

        int n = 0;
        while(true){
            n = in.nextInt();
            if(n == 0)
                break;
            else
                System.out.println(result[n]);
        }
    }
}

