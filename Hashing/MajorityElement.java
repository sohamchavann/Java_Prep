package Hashing;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
//            if(map.containsKey(num)){
//                map.put(num, (map.get(num)+1));
//            }else{
//                map.put(num, 1);
//            }
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        Set<Integer> keySet = map.keySet();
        for(int key : keySet){
            if (map.get(key) > (arr.length/3)){
                System.out.print(key + " ");
            }
        }
    }
}
