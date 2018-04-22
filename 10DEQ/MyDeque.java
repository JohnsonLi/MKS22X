public class MyDeque<E>{

    public E[] deck;
    public int front = 0, back = 0, size = 0;

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
        if (size() == deck.length - 1) {
            E[] temp = (E[]) new Object[deck.length * 2];
            for (int i = 0; i < size(); i++) {
                temp[0] = deck[(front + i) % deck.length];
            }
            front = 0;
            back = size() - 1;
            deck = temp;
        }
    }

    public void addFirst(E value){
        if(value == null){
            throw new NullPointerException();
        }
        resize();
        deck[(front + deck.length) % deck.length] = value;
        front--; 
        size++;

    }

    public String toString(){
        String deckStr = "[";
        for(int i = 0; i < deck.length; i++){
            if(i == deck.length - 1){
                deckStr += deck[i] + "";
            } else {
                deckStr += deck[i] + ", ";
            }
        }
        return deckStr += "]";
    }


    

    public static void main(String[] args) {
        MyDeque<Integer> n = new MyDeque<Integer>();
        // System.out.println(n.size());
        n.addFirst(1);
        n.addFirst(2);
        System.out.println(n.front);
    }




}