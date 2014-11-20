import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String s = in.next();
            char[] cs = s.toCharArray();
            Arrays.sort(cs);

            System.out.println(String.valueOf(cs));
        }
    }
}

