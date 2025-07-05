package Hashing;

import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> hs = new HashSet<>();
        //union:
        for(int i : arr1){
            hs.add(i);
        }
        for (int i : arr2){
            hs.add(i);
        }
        System.out.println("Union : " +hs.size());
        hs.clear();

        for(int i : arr1){
            hs.add(i);
        }
        int cnt = 0;
        for (int i : arr2){
            if(hs.contains(i)){
                cnt++;
                hs.remove(i);
            }
        }
        System.out.println("Intersection : " +cnt );
    }
}
