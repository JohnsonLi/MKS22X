public class RunningMedians{
    private MyHeap<Integer> minHeap = new MyHeap<>();
    private MyHeap<Integer> maxHeap = new MyHeap<>(false);
    private int median = -1;

    public void addValue(int value){
        if(minHeap.size() == 0 && maxHeap.size() == 0){
            median = value;
            maxHeap.add(value);
            // System.out.println("hello");
            return;
        } else {
            if(value <= median){
                // System.out.println("hello");
                maxHeap.add(value);
            } else {
                // System.out.println("hello");
                minHeap.add(value);
            }
        }
        if(minHeap.size() - maxHeap.size() == 0){
            // System.out.println("hello");
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        } else if(Math.abs(minHeap.size() - maxHeap.size()) == 1){
            // System.out.println("hello");
            median = minHeap.size() > maxHeap.size() ? minHeap.peek() : maxHeap.peek();
        } else if(Math.abs(minHeap.size() - maxHeap.size()) == 2){
            // System.out.println("hello");
            if(maxHeap.size() > minHeap.size()){
                minHeap.add(maxHeap.peek());
                maxHeap.remove();
            } else {
                maxHeap.add(minHeap.peek());
                minHeap.remove();
            }
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }

    }

    public int getMedian(){
        return median;
    }

    public static void main(String[] args) {
        RunningMedians n = new RunningMedians();
        n.addValue(1);
        n.addValue(3);
        n.addValue(5);
        System.out.println(n.getMedian());
    }

}