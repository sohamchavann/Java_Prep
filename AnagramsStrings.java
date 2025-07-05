// check if strings are anagrams

import java.util.Arrays;

public class AnagramsStrings {
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        if(str1.length() != str2.length()){
            System.out.println("Strings Are Not Anagrams");
        }
        else{
            char temparr1[] = str1.toCharArray();
            char temparr2[] = str2.toCharArray();
            Arrays.sort(temparr1);
            Arrays.sort(temparr2);
            boolean ans = Arrays.equals(temparr1,temparr2);
            if(ans==true){
                System.out.println("strings are anagram");
            }
            else System.out.println("Strings are not anagrams");
        }
    }
}
