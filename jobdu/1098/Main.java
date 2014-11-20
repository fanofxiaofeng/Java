import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String s = in.next();
            int[] cnt = new int[26];
            for(int i = 0;i < s.length();i++){
                if(Character.isUpperCase(s.charAt(i)))
                    cnt[(int)(s.charAt(i) - 'A')]++;
            }
            for(int i = 0;i < 26;i++)
                System.out.println(((char)('A' + i)) + ":" + cnt[i]);
        }
    }
}
