import java.util.*;

public class Mergesort{

    public static void merge(int[] ary, int left, int mid, int right){
        int leftlength = mid - left + 1;
        int rightlength = right - mid;

        int[] leftAry = new int[leftlength];
        int[] rightAry = new int[rightlength];

        for(int i = 0; i < leftlength; i++){
            leftAry[i] = ary[left + i];
        }
        for(int i = 0; i < rightlength; i++){
            rightAry[i] = ary[mid + 1 + i];
        }

        int leftStart = 0, rightStart = 0, start = left;
       
        while(left < leftlength && right < rightlength ){
            if(leftAry[leftStart] <= rightAry[start]){
                ary[start] = leftAry[leftStart];
                leftStart++;
            } else {
                ary[start] = rightAry[rightStart];
                rightStart++;
            }
            start++;
        }

        while(leftStart < leftlength || rightStart < rightlength){
            if(leftStart > rightStart){
                ary[start] = leftAry[leftStart];
                leftStart++;
                start++;
            } else {
                ary[start] = rightAry[rightStart];
                rightStart++;
                start++;
            }
        }
    }

    public static void mergesort(int[] ary){
        mergesortH(ary, 0, ary.length - 1);
    }

    public static void mergesortH(int[] ary, int start, int end){
        if(start > end){
            return;
        }
        int mid = (start + end) / 2;

        mergesortH(ary, start, mid);
        mergesortH(ary, mid + 1, end);
        merge(ary, start, mid, end);
    }

    public static void main(String[] args) {
        int[] ary = {123,21313,21331,44,5467,5877588,123,123123,5,64545,67};
        System.out.println(Arrays.toString(ary));
        Mergesort.mergesort(ary);
        System.out.println(Arrays.toString(ary));
    }

}