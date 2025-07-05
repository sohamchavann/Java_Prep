package Hashing;
import java.util.*;
public class ValidAnagram {
    public static boolean optimized(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str1.toCharArray()){
            map.put(ch, (map.getOrDefault(ch,0)+1));
        }
        for(char ch : str2.toCharArray()){
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }else{
                    map.put(ch , map.get(ch)-1);
                }
            }else{
                return false;
            }
        }

        return map.isEmpty();
    }
    public static boolean optimal(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char ch : str1.toCharArray()){
            map1.put(ch, (map1.getOrDefault(ch,0)+1));
        }
        for(char ch : str2.toCharArray()){
            map2.put(ch, (map2.getOrDefault(ch,0)+1));
        }

        if(map1.equals(map2)){
            return true;
        }else return false;
    }
    public static boolean bruteforce(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static boolean arrayApproach(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] count = new int[26]; // Assuming lowercase letters only

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int i : count) {
            if (i != 0) return false;
        }

        return true;
    }


    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
        System.out.println(optimized(str1, str2));
        System.out.println(bruteforce(str1,str2));
    }
}
