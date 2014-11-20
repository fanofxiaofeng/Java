import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String cards = in.next();
            String s = in.next();
            System.out.println((f(cards, s))?"YES":"NO");
        }
    }

    private static boolean f(String cards, String s){
        final int n = 10;
        int[] cnt = new int[n];
        for(int i = 0;i < cards.length();i++){
            char c = cards.charAt(i);
            cnt[(int)(c - '0')]++;
        }

        int value = (int)(s.charAt(0) - '0');
        switch(s.length()){
        case 5:
            for(int i = value + 1;i <= 5;i++){
                if(cnt[i] > 0 && cnt[i + 1] > 0 && cnt[i + 2] > 0 && cnt[i + 3] > 0 && cnt[i + 4] > 0)
                    return true;
            }
            return false;
        default:
            for(int i = value + 1;i < n;i++){
                if(cnt[i] >= s.length())
                    return true;
            }
            return false;
        }
    }
}

