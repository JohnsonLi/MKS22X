public class MyLinkedList{

    Node first, last;
    int length;

    public MyLinkedList(){
        first = null;
        last = null;
        length = 0;
    }

    public boolean add(int value){
        Node new = new Node(value);
        first = new.getValue();
        

        length++;
        
    }




    private class Node{
        Node prev, next;
        int data;

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