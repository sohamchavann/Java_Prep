package ArrayList;

import java.util.ArrayList;

public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        list.add(1); //o(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list1.add("Soham");
        System.out.println(list);
        System.out.println(list1);

        list.add(1, 9 ); //  O(n)
        System.out.println(list);
        //get opr: o(1)
        int element = list.get(1);
        System.out.println(element);

        //delete : O(n)
        list.remove(1);
        System.out.println(list);

        //set element at idx :  O(n)
        list.set(1,10);
        System.out.println(list);

        //contains : O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(123));

        //size func
        System.out.println(list.size());

        //print the array list
        for(int i = 0; i< list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //find maximum
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< list.size();i++){
            if (list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println(max);
    }
}
