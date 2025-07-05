package Hashing;
import java.util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 201);
        lhm.put("aus", 202);
        lhm.put("pak", 203);

        System.out.println(lhm);
    }
}
