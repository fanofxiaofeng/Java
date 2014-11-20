import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s = in.next();
            boolean valid = true;
            for(int b = 0, e = s.length() - 1;b < e;b++, e--){
                if(s.charAt(b) != s.charAt(e)){
                    valid = false;
                    break;
                }
            }
            System.out.println((valid)?("Yes!"):("No!"));
        }
    }
}
