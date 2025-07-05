package ArrayList;

import java.util.ArrayList;

public class forEach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.forEach(num -> System.out.println(num*num));
    }
}
