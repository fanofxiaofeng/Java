import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int opt = 12;
        String target = "Sandro";
        for(int i = 0;i <= s.length() - 6;i++){
            int price = diff(s, i, target);
            if(price < opt)
                opt = price;
        }
        System.out.println(5 * opt);
    }

    private static int diff(String s, int start, String target){
        int result = 0;
        for(int i = start;i < start + 6;i++){
            char c = s.charAt(i);
            result += compare(c, target.charAt(i - start));
        }
        return result;
    }

    private static int compare(char c1, char c2){
        if(c1 == c2)
            return 0;
        if(Character.isUpperCase(c1) && Character.isUpperCase(c2))
            return 1;
        else if(Character.isLowerCase(c1) && Character.isLowerCase(c2))
            return 1;
        else if(c1 - 32 == c2 || c2 - 32 == c1)
            return 1;
        else
            return 2;
    }
}

