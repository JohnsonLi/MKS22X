public class MyLinkedList{

    Node first, last;
    int size;

    public MyLinkedList(){
        first = null;
        last = null;
        size = 0;
    }

    public boolean add(Integer value){
        Node toAdd = new Node(value);
        if(size == 0){
            first = toAdd;
            last = toAdd;
        } else {
            
        }

        

        size++;
        
    }




    private class Node{
        Node prev, next;
        Integer data;

        public Node(data){
            this.prev = null;
            this.next = null;
            this.data = data;
        }

        public Node getNext(){return next;}
        public Node getPrev(){return prev;}
        public int getValue(){return data;}

        public void setNext(Node node){this.next = node;}
        public void setPrev(Node node){this.prev = node;}
        public void setValue(int value){this.data = value;}

        public String toString(){
            return "" + data;
        }
    }

}