import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int n = in.nextInt();// number of cities
            if(n == 0)
                break;
            int m = in.nextInt();// number of roads

            // initialization
            int[] parent = new int[n + 1];
            for(int i = 0;i <= n;i++)
                parent[i] = i;

            int[] h = new int[n + 1];// height

            // connect cities by roads
            for(int i = 0;i < m;i++){
                int a = in.nextInt();
                int b = in.nextInt();

                int aRoot = getRoot(parent, a);
                int bRoot = getRoot(parent, b);

                if(aRoot != bRoot){
                    if(h[aRoot] < h[bRoot]){
                        parent[aRoot] = bRoot;
                    } else if(h[aRoot] > h[bRoot]){
                        parent[bRoot] = aRoot;
                    } else {// h[aRoot] == h[bRoot]
                        parent[aRoot] = bRoot;
                        h[bRoot]++;
                    }
                }
            }

            // calculate the number of connected components
            boolean[] touched = new boolean[n + 1];
            for(int i = 1;i <= n;i++){
                int root = getRoot(parent, i);
                touched[root] = true;
            }
            int cnt = 0;
            for(int i = 1;i <= n;i++){
                if(touched[i])
                    cnt++;
            }

            System.out.println((cnt == 1)?"YES":"NO");
        }
    }

    private static int getRoot(int[] parent, int id){
        if(parent[id] != id)
            parent[id] = getRoot(parent, parent[id]);
        return parent[id];
    }
}
