import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
        for(int i = 0;i < total;i++){
            long k = in.nextInt();
            long n = (long)((-1 + Math.sqrt(8 * k - 7)) / 2);
            if((n + 1) * n / 2 + 1 == k)
                System.out.print("1");
            else
                System.out.print("0");
            if(i + 1 != total)
                System.out.print(" ");
        }
    }
}
