import java.util.*;

public class Quickselect{

    private static void swap(int[] data, int a, int b){
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public static int partition(int[] data, int start, int end){
        int pivInd = (int)(Math.random() * (end - start)) + start;
        int piv = data[pivInd];
        System.out.println(pivInd);
        System.out.println(piv);

        for(int current = start; current < end + 1; current++){
            if(current == pivInd){
                continue;
            }
            if(data[current] > piv && current < pivInd){
                swap(data, current, pivInd);
                pivInd = current;
            } else if(data[current] <= piv && current > pivInd){
                if(current - pivInd > 1){
                    swap(data, current, pivInd);
                    pivInd += 1;
                    swap(data, pivInd, current);
                } else {
                    swap(data, current, pivInd);
                    pivInd = current;
                }
            }
        }
        return pivInd;
    }

    public static void main(String[] args) {
        int[] arr = {123,21314,5345,77898,12333,676,2113,213124123,2333,1,566,889,21,5,92,2};
        System.out.println(Arrays.toString(arr));
        System.out.println(Quickselect.partition(arr, 0, arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }
}