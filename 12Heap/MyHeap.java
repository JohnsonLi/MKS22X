import java.util.*;

public class MyHeap/*<String extends Comparable<String>>*/{
    public boolean max = true;
    public int[] heap;
    public int size = 0;

    // @SuppressWarnings("unchecked")
    public MyHeap(){
        heap = new int[1];
    }

    // @SuppressWarnings("unchecked")
    public MyHeap(boolean e){
        max = e;
        heap = new int[1];
    }

    public int size(){return size;}

    private void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    // @SuppressWarnings("unchecked")
    public void resize(){
        if(size() == heap.length){
            int[] temp = new int[heap.length * 2];
            for(int i = 0; i < heap.length; i++){
                temp[i] = heap[i];
            }
            heap = temp;
        }
    }

    private boolean hasParent(int index){
        if(index == 0){
            return false;
        }
        return (index - 1) / 2 >= 0;
    }

    private int getParent(int index){
        return (index - 1) / 2;
    }

    private boolean hasChildren(int index){
        return 2 * index + 1 < heap.length - 1  && heap[2 * index + 1] != 0 ||
               2 * index + 2 < heap.length - 1  && heap[2 * index + 2] != 0;
    }

    // private int getRChild(int index){
    //     return 2 * index + 1;
    // }

    // private int getLChild(int index){
    //     return 2 * index + 2;
    // }

    public int peek(){
        return heap[0];
    }

    public void add(int s){
        resize();
        heap[size] = s;
        if(max){
            pushUpMax(size);
        } else {
            pushUpMin(size);
        }
        size++;
    }

    private void pushUpMax(int index){
        // if(!hasParent(index) || heap[index].compareTo(heap[getParent(index)]) < 0){
        //     return;
        // } 
        if(!hasParent(index) || heap[index] < heap[getParent(index)]){
            return;
        } 
        swap(index, getParent(index));
        pushUpMax(getParent(index));
    }    

    private void pushUpMin(int index){
        // if(!hasParent(index) || heap[index].compareTo(heap[getParent(index)]) > 0){
        //     return;
        // } 
        if(!hasParent(index) || heap[index] > heap[getParent(index)]){
            return;
        }
        swap(index, getParent(index));
        pushUpMin(getParent(index));
    }  

    public int remove(){
        int removed = heap[0];
        swap(0, size() - 1);
        if(max){
            pushDownMax(0);
        } else {
            pushDownMin(0);
        }
        size--;
        return removed;
    }

    public void pushDownMax(int index){
        if(!hasChildren(index) || )
    }



    public String toString(){
        String array = "[";
        for(int i = 0; i < size(); i++){
            if(i == size() - 1){
                array += heap[i];
            } else {
                array += heap[i] + ", ";
            }
        }
        return array + "]";
    }

    public static void main(String[] args) {
        MyHeap n = new MyHeap();
        System.out.println(n);
        n.add(24);
        n.add(30);
        n.add(54);
        n.add(16);
        n.add(3);
        n.add(7);
        System.out.println(n.peek());
        // n.add(100);
        // n.add("a");
        // n.add("b");
        // n.add("c");
        // n.add("d");
        // n.add("e");
        System.out.println(n);
    }

}

