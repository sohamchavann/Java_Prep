//Print all posiible permutations of the string
package BackTracking;

public class Permutations {
    public static void findPermutation(String str, String ans){//TC: O(n* n!) SC = 0(n)
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i = 0 ; i<str.length();i++){
            char currChar = str.charAt(i);
            String newstr = str.substring(0,i) + str.substring(i+1,str.length());
            findPermutation(newstr, ans+currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}
