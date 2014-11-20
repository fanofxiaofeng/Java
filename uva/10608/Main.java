import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        for(int i = 0;i < total;i++){
            int n = in.nextInt();
            int m = in.nextInt();
            UF uf = new UF(n);
            for(int j = 0;j < m;j++){
                int left = in.nextInt();
                int right = in.nextInt();
                if(uf.isConnected(left - 1, right - 1) == false)
                    uf.union(left - 1, right - 1);
            }
            System.out.println(uf.getMaxSize());
        }
	}
}

class UF{
    private int[] id;
    private int[] size;

    UF(int n){
        id = new int[n];
        size = new int[n];
        for(int i = 0;i < n;i++)
            id[i] = i;
        for(int i = 0;i < n;i++)
            size[i] = 1;
    }

    public int getMaxSize(){
        int opt = 0;
        for(int i = 0;i < size.length;i++){
            if(size[i] > opt)
                opt = size[i];
        }
        return opt;
    }

    public int getRoot(int query){
        while(id[query] != query){
            query = id[query];
        }
        return id[query];
    }

    public boolean isConnected(int a, int b){
        int rootA = getRoot(a);
        int rootB = getRoot(b);
        return rootA == rootB;
    }

    public void union(int a, int b){
        int rootA = getRoot(a);
        int rootB = getRoot(b);
        if(size[rootA] <= size[rootB]){
            id[rootA] = rootB;
            size[rootB] += size[rootA];
            // size[rootA] = 0;
        } else {
            id[rootB] = rootA;
            size[rootA] += size[rootB];
        }
    }
};
