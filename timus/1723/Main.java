import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int opt = 0;
        String record = "";
        for(int i = 0;i < s.length();i++){
            for(int j = i + 1;j <= s.length();j++){
                String sub = s.substring(i, j);
                int len = sub.length();
                int cnt = 0;
                for(int k = i;k < s.length();k++){
                    if(s.substring(k, Math.min(k + len, s.length())).equals(sub))
                        cnt++;
                }
                if(cnt > opt){
                    opt = cnt;
                    record = sub;
                }
            }
        }
        System.out.println(record);
    }
}
