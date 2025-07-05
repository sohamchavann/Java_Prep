//find length of string using recursion
package RecursionBasics;

public class HWProblems {
    public static void main(String[] args) {
        System.out.println(length("Soham", 0));
    }
    public static int length(String str, int i){
        if(str.length() == i){
            return 0;
        }
        return 1+ length(str, i+1);

    }
}
