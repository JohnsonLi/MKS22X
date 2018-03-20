import java.util.*;

public class Mergesort{

    public static void merge(int[] ary, int left, int right){
        int[] temp = new int[ary.length];

        int mid = (left + right) / 2 + 1;
        int leftStart = left, start = left;
       
        while(leftStart < (left + right) / 2 + 1 && mid <= right){
            if(ary[leftStart] <= ary[mid]){
                temp[start] = ary[leftStart];
                leftStart++;
            } else {
                temp[start] = ary[mid];
                mid++;   
            }
            start++;
        }

        while(leftStart < (left + right) / 2 + 1) {
            temp[start] = ary[leftStart];
            leftStart++;
            start++;
        }
        while(mid <= right){
            temp[start] = ary[mid];
            mid++;
            start++;
        }

        for(int i = left; i <= right; i++){
            ary[i] = temp[i];
        }

    }

    public static void mergesort(int[] ary){
        mergesortH(ary, 0, ary.length - 1);
    }

    public static void mergesortH(int[] ary, int start, int end){
        // if(start >= end){
        //     return;
        // }
        int mid = (start + end) / 2;

        if(end > start){
            mergesortH(ary, start, mid);
            mergesortH(ary, mid + 1, end);
            merge(ary, start, end);
        }
    }

    // public static void main(String[] args) {
    //     int[] ary = //{123,21313,21331,44,5467,5877588,123,123123,5,64545,67};
    //     {213,3123123,124,54,3456,7,58,57,46363625,2,235,55,646,67};
    //     System.out.println(Arrays.toString(ary));
    //     Mergesort.mergesort(ary);
    //     System.out.println(Arrays.toString(ary));
    // }

}