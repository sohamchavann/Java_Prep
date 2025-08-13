package Heaps;
public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> minHeap = new Heap<>();

        minHeap.insert(10);
        minHeap.insert(12);
        minHeap.insert(2);
        minHeap.insert(22);
        minHeap.insert(13);
        minHeap.insert(6);

        System.out.println(minHeap.remove());
        System.out.println(minHeap.heapSort());
    }
}
