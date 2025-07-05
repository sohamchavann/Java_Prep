package Hashing;
import java.util.*;
public class HashSetImplementation {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Delhi");
        set.add("mumbai");
        set.add("Pune");
        set.add("bangalore");

        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for(String city : set){
            System.out.println(city);
        }
    }
}
