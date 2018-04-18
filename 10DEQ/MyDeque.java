public class MyDeque<E>{

    public E[] deck;

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
        return deck.length;
    }

    

    public static void main(String[] args) {
        MyDeque<Integer> n = new MyDeque<Integer>(167);
        System.out.println(n.size());
    }




}