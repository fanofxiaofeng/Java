import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String s = in.next();
            char[] cs = s.toCharArray();
            for(int b = 0, e = s.length() - 1;b < e;b++, e--){
                char temp = cs[b];
                cs[b] = cs[e];
                cs[e] = temp;
            }

            System.out.println(String.valueOf(cs));
        }
    }
}

