import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        for(int i = 1000;i < 10000;i++){
            if(valid(i))
                System.out.println(i);
        }
    }

    private static boolean valid(int i){
        int target = 9 * i;
        int reverse = 0;
        for(int loop = 0;loop < 4;loop++){
            reverse = 10 * reverse + i % 10;
            i /= 10;
        }
        return target == reverse;
    }
}

