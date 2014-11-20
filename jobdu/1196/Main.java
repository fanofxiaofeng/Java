import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();

            int[] id = new int[n];
            int[] score = new int[n];
            for(int i = 0;i < n;i++){
                id[i] = in.nextInt();
                score[i] = in.nextInt();
            }

            quickSort(score, id, 0, n - 1);

            for(int i = 0;i < n;i++)
                System.out.println(id[i] + " " + score[i]);
        }
    }

    private static void quickSort(int[] score, int[] id, int low, int high){
        if(low >= high)
            return;

        // check whether the array is already sorted
        boolean sorted = true;
        for(int i = low;i < high;i++){
            if(lt(score[i], id[i], score[i + 1], id[i + 1]) == false){// no two "elements" will be equal, so just use "lt" function
                sorted = false;
                break;
            }
        }
        if(sorted == true)
            return;

        // random swap
        Random r = new Random();
        int temp = low + r.nextInt(high - low);
        swap(temp, high, score);
        swap(temp, high, id);

        // partition
        int scoreOfEnd = score[high];// score[high]
        int idOfEnd = id[high];// id[high]

        int i = low - 1;
        for(int j = low;j < high;j++){
            if(lt(score[j], id[j], scoreOfEnd, idOfEnd)){
                i++;
                swap(i, j, score);
                swap(i, j, id);
            }
        }
        swap(i + 1, high, score);
        swap(i + 1, high, id);
        quickSort(score, id, low, i);
        quickSort(score, id, i + 2, high);
    }

    private static boolean lt(int s1, int id1, int s2, int id2){
        return (s1 < s2) || (s1 == s2 && id1 < id2);
    }

    private static void swap(int p1, int p2, int[] a){
        int temp = a[p1];
        a[p1] = a[p2];
        a[p2] = temp;
    }
}
