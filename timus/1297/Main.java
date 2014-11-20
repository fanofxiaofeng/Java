import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str = in.next();

		char[] cs = new char[2 * str.length() + 2 + 1];

        cs[0] = '^';
        cs[cs.length - 1] = '$';

        for(int i = 0;i < str.length();i++)
            cs[i * 2 + 2] = str.charAt(i);

        int rightMostReached = 0;
        int withPos = 0;

        int[] r = new int[cs.length];// radius

        for(int i = 1;i < cs.length - 1;i++){
            int temp;
            if(i <= rightMostReached)
                temp = (rightMostReached - i + 1 <= r[2 * withPos - i])?(rightMostReached - i + 1):(r[2 * withPos - i]);
            else
                temp = 1;

            while(cs[i + temp] == cs[i - temp])
                temp++;

            r[i] = temp;
            if(i + temp - 1 > rightMostReached){
                rightMostReached = i + temp - 1;
                withPos = i;
            }
        }

        int lenOpt = -1;
        int posOpt = -1;

        for(int i = 1;i < cs.length - 1;i++){
            if(r[i] > lenOpt){
                lenOpt = r[i];
                posOpt = i;
            }
        }

        int palindromeLen = (2 * lenOpt - 1) / 2;
        int start = (posOpt + 1 - 2) / 2 - palindromeLen / 2;

        System.out.println(str.substring(start, start + palindromeLen));
	}
}
