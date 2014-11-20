import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            final int l = in.nextInt();

            int[] a = new int[l];
            for(int i = 0;i < l;i++)
                a[i] = in.nextInt();

            int target = in.nextInt();

            int i = 0;
            for(;i < l;i++){
                if(a[i] == target)
                    break;
            }

            System.out.println((i != l)?i:(-1));
        }
    }
}

