import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int cost = 0;
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(c == '.' || c == ' ' || c == 'y')
                cost += 1;
            else if(c == ',' || c == 'z')
                cost += 2;
            else if(c == '!')
                cost += 3;
            else
                cost += ((int)c - (int)'a') % 3 + 1;
        }
        System.out.println(cost);
    }
}
