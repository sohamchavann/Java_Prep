package Heaps;
import java.util.ArrayList;
public class MaxHeap {
    private ArrayList<Integer> list;

    public MaxHeap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }

    private int left(int index){
        return index*2+1;
    }
    private int right(int index){
        return index*2+2;
    }
    public void insert(int value){
        list.add(value);
        upHeap(list.size()-1);
    }
    private void upHeap(int index){
        if(index==0) return;
        int p = parent(index);
        if(list.get(p)<list.get(index)){
            swap(p, index);
            upHeap(p);
        }
    }
    public int remove() throws Exception {
        if (list.isEmpty()) throw new Exception("Removing from empty heap!");
        int temp = list.get(0);
        int last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }
    private void downHeap(int index){
        int left = left(index);
        int right = right(index);
        int max =index;

        if (left < list.size() && list.get(max) < list.get(left)) {
            max = left;
        }
        if (right < list.size() && list.get(max) < list.get(right)) {
            max = right;
        }
        if(max!=index){
            swap(max, index);
            downHeap(max);
        }
    }
}
