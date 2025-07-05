package Hashing;
import java.sql.SQLOutput;
import java.util.*;
public class HashMapOperations {
    public static void main(String[] args) {
        //Create - o(1)
        HashMap<String, Integer> hm = new HashMap<>();

        //insert - o(1)
        hm.put("India", 100);
        hm.put("Indonesia", 50);
        hm.put("Brazil", 150);
        hm.put("Brazil", 20);
        System.out.println(hm);

        //get - o(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Dubai"));

        //ContainsKey - o(1)
        System.out.println(hm.containsKey("Brazil"));
        System.out.println(hm.containsKey("Dubai"));

        //remove - o(1)
        System.out.println(hm.remove("Indonesia"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //is Empty
        System.out.println(hm.isEmpty());

        //clear
//        hm.clear();
//        System.out.println(hm);

        //entryset
        System.out.println("Set View: " + hm.entrySet());

        //iteration in Hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key : " +k +" value : " +hm.get(k));
        }


    }
}
