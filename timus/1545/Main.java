import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] ss = new String[n];
        for(int i = 0;i < n;i++)
            ss[i] = in.next();

        String lastOne = in.next();
        char c = lastOne.charAt(0);
        for(int i = 0;i < n;i++){
            if(ss[i].charAt(0) == c)
                System.out.println(ss[i]);
        }
    }
}

