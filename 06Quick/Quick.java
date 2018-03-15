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

        int index = partition(data, start, end);

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

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Quick.quickselect(arr, 9));
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Quick.partition(arr, 0, arr.length - 1));
        // System.out.println(Arrays.toString(arr));
    }
}