import com.sun.glass.ui.Size;

public class RunningMedian {
    private MyHeap<Double> minHeap = new MyHeap<>(false);
    private MyHeap<Double> maxHeap = new MyHeap<>();
    private double median;

    public void addValue(double value) {
        if (minHeap.size() == 0 && maxHeap.size() == 0) {
            median = value;
            maxHeap.add(value);
            return;
        } else {
            if (value <= median) {
                maxHeap.add(value);
            } else {
                minHeap.add(value);
            }
        }
        if (minHeap.size() - maxHeap.size() == 0) {
            median = (minHeap.peek() + maxHeap.peek()) / 2.0;
        } else if (Math.abs(minHeap.size() - maxHeap.size()) == 1) {
            median = minHeap.size() > maxHeap.size() ? minHeap.peek() : maxHeap.peek();
        } else if (Math.abs(minHeap.size() - maxHeap.size()) == 2) {
            if (maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.remove());
            } else {
                maxHeap.add(minHeap.remove());
            }
            median = (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
    }

    public double getMedian() {
        return median;
    }

    public int size() {
        return minHeap.size() + maxHeap.size();
    }

    // public static void main(String[] args) {
    // RunningMedian n = new RunningMedian();
    // n.addValue(1);
    // n.addValue(2);
    // n.addValue(5);
    // n.addValue(587);
    // n.addValue(2131312);
    // System.out.println(n.size());
    // System.out.println(n.getMedian());
    // }

}
