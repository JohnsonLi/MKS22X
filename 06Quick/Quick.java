import java.util.*;

public class Quick{

    private static void swap(int[] data, int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public static int partition(int[] data, int start, int end){
        int pivInd = (int)(Math.random() * (end - start)) + start;
        System.out.println(pivInd);
        
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

    public static void main(String[] args) {
        int[] arr = {123,445,667,124,54555};
        System.out.println(Quick.quickselect(arr, 5));
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Quick.partition(arr, 0, arr.length - 1));
        // System.out.println(Arrays.toString(arr));
    }
}