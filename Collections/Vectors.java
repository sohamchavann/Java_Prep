package Collections;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(1);
        v1.add(2);
        v1.add(3);

        for (int v : v1){
            System.out.println(v);
        }

        v1.set(1,0);
        v1.add(1,21);
        System.out.println(v1);
    }
}
