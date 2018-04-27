import java.util.*;

public class MyHeap{
    public boolean max = true;
    public String[] heap = new String[1];
    public int size = 0;

    public MyHeap(){}
    public MyHeap(boolean e){
        max = e;
    }

    public int size(){return size;}

    public void resize(){
        if(size() == heap.length){
            String[] temp = new String[heap.length * 2];
            for(int i = 0; i < heap.length; i++){
                temp[i] = heap[i];
            }
            heap = temp;
        }
    }

    private boolean hasParent(int index){
        return (index - 1) / 2 < 0;
    }

    private String getParent(int index){
        return heap[(index - 1) / 2];
    }

    private boolean[] hasChildren(int index){
        boolean[] n = new boolean[2];
        n[0] = heap[2 * index + 1] != null;
        n[1] = heap[2 * index + 2] != null;
        return n;
    }

    private String getRChild(int index){
        return heap[2 * index + 1];
    }

    private String getLChild(int index){
        return heap[2 * index + 2];
    }

    public void add(String s){
        if(max){

        }
    }

    private void pushUpMax(int index){
        if(!hasParent(index) || heap[index].compareTo(getParent(index)) < 0)){
            return;
        }

    }    

    // public static void main(String[] args) {
    //     MyHeap n = new MyHeap();
    //     System.out.println(Arrays.toString(n.heap));
    // }

}