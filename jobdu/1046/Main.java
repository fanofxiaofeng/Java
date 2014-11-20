import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int opt = 0;
            for(int i = 0;i < 10;i++){
                int temp = in.nextInt();
                if(i == 0)
                    opt = temp;
                else
                    opt = (temp >= opt)?temp:opt;
            }
            System.out.println("max=" + opt);
        }
    }
}

