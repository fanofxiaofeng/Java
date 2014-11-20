import java.util.*;
import java.math.BigInteger;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            String preOrder = in.next();
            String inOrder = in.next();
            printPostOrder(preOrder, inOrder, 0, preOrder.length() - 1, 0, inOrder.length() - 1);
            System.out.println();
        }
    }

    private static void printPostOrder(String pre, String in, int preStart, int preEnd, int inStart, int inEnd){
        if(preStart == preEnd){
            System.out.print(pre.charAt(preStart));
            return;
        }

        char rootChar = pre.charAt(preStart);
        for(int i = inStart;;i++){
            if(in.charAt(i) == rootChar){
                int leftLen = i - inStart;
                if(leftLen > 0)
                    printPostOrder(pre, in, preStart + 1, preStart + leftLen, inStart, inStart + leftLen - 1);

                int rightLen = inEnd - i;
                if(rightLen > 0)
                    printPostOrder(pre, in, preStart + leftLen + 1, preEnd, i + 1, inEnd);

                System.out.print(rootChar);
                return;
            }
        }
    }
}
