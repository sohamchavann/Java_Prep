//given n genrate all binary numbers till it from 1
package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryStrings {
    public static void soln(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n>0){
            String temp =q.remove();
            System.out.println(temp);

            q.add(temp+"0");
            q.add(temp+"1");
            n--;
        }
     }
    public static void main(String[] args) {
        soln(5);
    }
}
