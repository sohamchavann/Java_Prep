package String;

import java.util.*;

public class StringsBasics {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = new String("xyz&^*GHg");

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);

        String fullName = "Soham Sanjay Chavan";
        System.out.println(fullName.length());

        System.out.println(fullName.charAt(1));
    }
    
}
