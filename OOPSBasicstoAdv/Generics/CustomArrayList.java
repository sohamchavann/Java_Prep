package OOPSBasicstoAdv.Generics;
import java.util.*;
public class CustomArrayList {
    private int data[];
    private int size = 0 ;
    private static int DEFAULT_SIZE = 10;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    private void resize() {
        int temp[] = new int[data.length * 2];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data  = temp;
    }
    private boolean isFull() {
        if(size == data.length){
            return true;
        }
        return false;
    }

    public int remove(){
        int temp = data[size];
        size--;
        return temp;
    }
    public int get(int index) {
        return data[index];
    }
    public int size() {
        return size+1;
    }
    public void set(int index, int value) {
        data[index] = value;
    }
    @Override
    public String toString(){
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
    }
}
