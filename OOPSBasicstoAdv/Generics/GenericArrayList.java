package OOPSBasicstoAdv.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericArrayList<T> {
    private Object[] data;

    private int size = 0 ;
    private static int DEFAULT_SIZE = 10;

    public GenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    private void resize() {
        Object temp[] = new Object[data.length * 2];
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

    public T remove(){
        T temp = (T)data[size];
        size--;
        return temp;
    }
    public T get(int index) {
         return (T)data[index];
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
        GenericArrayList<Integer> list = new GenericArrayList<>();
        for (int i = 0; i < 14; i++) {
            list.add(2 * i);
        }
        System.out.println(list);
    }
}
