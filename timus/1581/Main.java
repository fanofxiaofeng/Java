import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] data = new int[n];
        for(int i = 0;i < n;i++)
            data[i] = in.nextInt();

        int previous = data[0];
        int cnt = 1;

        for(int i = 1;i < n;i++){
            if(data[i] != previous){
                System.out.print("" + cnt + " " + previous + " ");
                previous = data[i];
                cnt = 1;
            } else {
                cnt++;
            }
        }
        System.out.println("" + cnt + " " + previous);
    }
}
