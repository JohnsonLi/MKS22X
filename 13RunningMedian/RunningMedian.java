public class RunningMedian{
    private MyHeap<Integer> minHeap = new MyHeap<>(false);
    private MyHeap<Integer> maxHeap = new MyHeap<>();
    private int median;

    public void addValue(int value){
        if(minHeap.size() == 0 && maxHeap.size() == 0){
            median = value;
            maxHeap.add(value);
            return;
        } else {
            if(value <= median){
                maxHeap.add(value);
            } else {
                minHeap.add(value);
            }
        }
        if(minHeap.size() - maxHeap.size() == 0){
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        } else if(Math.abs(minHeap.size() - maxHeap.size()) == 1){
            median = minHeap.size() > maxHeap.size() ? minHeap.peek() : maxHeap.peek();
        } else if(Math.abs(minHeap.size() - maxHeap.size()) == 2){
            if(maxHeap.size() > minHeap.size()){
                minHeap.add(maxHeap.remove());
            } else {
                maxHeap.add(minHeap.remove());
            }
            median = (minHeap.peek() + maxHeap.peek()) / 2;
        }
    }

    public int getMedian(){
        return median;
    }

    // public static void main(String[] args) {
    //     RunningMedians n = new RunningMedians();
    //     n.addValue(1);
    //     n.addValue(3);
    //     n.addValue(5);
    //     n.addValue(587);
    //     System.out.println(n.getMedian());
    // }

}
