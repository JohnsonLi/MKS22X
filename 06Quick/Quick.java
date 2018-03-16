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

    private static int[] dutch(int[] ary, int start, int end){
        int hi = end - 1;
        int lo = start;
        int i = 0;
        int pivNum = ary[i];
        //System.out.println(pivNum);

        while(i <= hi){
            if(ary[i] < pivNum){
                swap(ary, i, lo);
                i++;
                lo++;
            } else if(ary[i] > pivNum){
                swap(ary, i, hi);
                hi--;
            } else {
                i++;
            }
        }
        // System.out.println(lo);
        // System.out.println(hi);
        // Arrays.toString(ary);
        return new int[] {lo, hi};
    }

    public static void quickDutch(int[] ary){
        quickDutchH(ary, 0, ary.length);
    }

    public static void quickDutchH(int[] ary, int start, int end){
        if(end <= start){
            return;
        }
        int lo,hi;
        int[] res = dutch(ary, start, end);
        lo = res[0];
        hi = res[1];
        quickDutchH(ary, start, lo - 1);
        quickDutchH(ary, hi + 1, end); 
    }

    public static void main(String[] args) {
        int[] ary = /*{999,999,999,4,1,0,3,2,999,999,999};*/{12,23213,434,34,34,34,34,34,213123,21323,2323,123,123,123,444444};
        // System.out.println(Arrays.toString(ary));
        // Quick.quicksort(ary);
        // System.out.println(Arrays.toString(ary));

        // System.out.println(Arrays.toString(ary));
        // System.out.println(Quick.partition(ary, 0, ary.length - 1));
        // System.out.println(Arrays.toString(ary));
        System.out.println(Arrays.toString(ary));
        //Quick.dutch(ary, 0, ary.length);
        Quick.quickDutch(ary);
        System.out.println(Arrays.toString(ary));
    }
}