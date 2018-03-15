import java.util.*;

public class Quick{

    private static void swap(int[] data, int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public static int partition(int[] data, int start, int end){
        int pivInd = (int)(Math.random() * (end - start)) + start;
        //System.out.println(pivInd);
        
        swap(data, pivInd, start);
        int i = start + 1;
        int j = end;

        while(i <= j){
            if(data[i] > data[start]){
                swap(data, i, j);
                j--;
            } else {
                i++;
            }
        }
        swap(data, j, start);
        return j;
    }

    public static int quickselect(int[] data, int k){
        int start = 0;
        int end = data.length - 1;
        // I have no idea why index has to be set at data.length - 1; other values make it go forever :\\\\\
        int index = data.length - 1;

        k -= 1;
        while(index != k){
            if(index > k){
                end = index;
                index = partition(data, start, end);
            } else {
                start = index;
                index = partition(data, start, end);
            }
        }
        return data[index];
    }

    public static void quicksort(int[] ary){
        quickH(ary, 0, ary.length - 1);
    }

    public static void quickH(int[] ary, int start, int end){
        if(end >= start){
            int index = partition(ary, start, end);
            quickH(ary, start, index - 1);
            quickH(ary, index + 1, end);
        }
    }

    public static void dutch(int[] ary, int lt, int gt){
        int lt = 0;
        int gt = ary.length - 1;
        int i = (int)(Math.random() * (end - start)) + start;
        int pivNum = ary[i];

        while(i <= gt){
            if(arr[i] == pivNum){
                i++;
            }
            if(arr[i] > pivNum){
                swap(ary, i, gt);
                gt--;
            }
            if(arr[i] < pivNum){
                swap(ary, i, lt){
                    i++;
                    lt++;
                }
            }
        }
    }

    // public static void main(String[] args) {
    //     int[] arr = {123,445,667,124,54555,34,6,3,5,788,345,636363434,5345,43};
    //     System.out.println(Arrays.toString(arr));
    //     Quick.quicksort(arr);
    //     System.out.println(Arrays.toString(arr));

    //     // System.out.println(Arrays.toString(arr));
    //     // System.out.println(Quick.partition(arr, 0, arr.length - 1));
    //     // System.out.println(Arrays.toString(arr));
    // }
}