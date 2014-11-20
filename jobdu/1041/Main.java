import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = in.nextInt();
            // 将数据存入数组
            int[] data = new int[n];
            for(int i = 0;i < n;i++)
                data[i] = in.nextInt();

            // 快排
            quickSort(data, 0, n - 1);

            // 输出元素(出现次数超过1的,只输出1次)
            System.out.print(data[0]);
            int pre = data[0];
            for(int i = 1;i < n;i++){
                if(data[i] != pre){
                    System.out.print(" " + data[i]);
                    pre = data[i];
                }
            }
            System.out.println();
        }
    }

    private static void quickSort(int[] array, int low, int high){
        if(low >= high)
            return;

        int x = array[high];
        int i = low - 1;
        for(int j = low;j < high;j++){
            if(array[j] < x)
                swap(array, ++i, j);
        }
        swap(array, i + 1, high);
        quickSort(array, low, i);
        quickSort(array, i + 2, high);
    }

    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
