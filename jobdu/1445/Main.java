import java.util.*;
import java.math.BigInteger;

public class Main{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int rubbish = in.nextInt();
        while(in.hasNext()){
            int n = in.nextInt();
            int m = in.nextInt();
            UF uf = new UF(n);
            for(int i = 0;i < m;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                uf.union(a - 1, b - 1);
            }
            System.out.println(uf.getCcCnt());
        }
    }
}

class UF{
    int[] id;
    int[] size;
    int ccCnt;
    UF(int n){
        id = new int[n];
        size = new int[n];
        ccCnt = n;

        for(int i = 0;i < n;i++)
            id[i] = i;

        Arrays.fill(size, 1);
    }

    public int getRoot(int query){
        while(id[query] != query)
            query = id[query];
        return query;
    }

    public boolean isConnected(int a, int b){
        int rootA = getRoot(a);
        int rootB = getRoot(b);
        return rootA == rootB;
    }

    public void union(int a, int b){
        int rootA = getRoot(a);
        int rootB = getRoot(b);
        if(rootA == rootB)
            return;

        if(size[rootA] <= size[rootB]){
            id[rootA] = rootB;
            size[rootB] += size[rootA];
        } else {
            id[rootB] = rootA;
            size[rootA] += size[rootB];
        }
        ccCnt--;
    }

    public int getCcCnt(){
        return ccCnt;
    }
}
