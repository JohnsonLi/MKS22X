public class MyDeque<E>{

    public E[] deck;
    public int first = 0, last = 0, size = 0;

    @SuppressWarnings("unchecked")
    public MyDeque(){
        deck = (E[]) new Object[10]; 
    }

    @SuppressWarnings("unchecked")
    public MyDeque(int initialCapacity){
        if(initialCapacity < 0){
            throw new IllegalArgumentException();
        }
        deck = (E[]) new Object[initialCapacity]; 
    }

    public int size(){
        return size;
    }

    @SuppressWarnings("unchecked")
    public void resize(){
        E[] new = (E[]) new Object[deck.length * 2];
        for(int i = 0; i < size(); i++){
            new[0] = deck[(front + i) % deck.length];
        }
        deck = new;
    }

    public void addFirst(T value){
        if(value == null){
            throw new NullPointerException();
        }
        if(size() == deck.length - 1){
            resize();
        }
        

    }




    

    public static void main(String[] args) {
        MyDeque<Integer> n = new MyDeque<Integer>(167);
        System.out.println(n.size());
    }




}