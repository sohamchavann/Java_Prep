//You are given a number (e.g., 2019), convert it into a String of English like "two zero one nine". Use a recursive function to solve this problem.
//NOTE:The digits of the number will only be in the range 0-9.
//The last digit of a number can't be 0.
//Sample Input: 1947
//Sample Output: "one nine four seven"
package RecursionBasics;

public class convNums2Words {

    public static void main(String[] args) {
        String arrmap[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int num = 1947; // Input number
        soln(num, arrmap);
    }

    public static void soln(int num, String arrmap[]) {
        // Base case: if the number becomes 0, return
        if (num == 0) {
            return;
        }
        // Recursive call on the number except the last digit
        soln(num / 10, arrmap);

        // Process the last digit and print it
        System.out.print(arrmap[num % 10] + " ");
    }
}
//package RecursionBasics;
//
//public class convNums2Words {
//
//    public static void main(String[] args) {
//        String arrmap[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//        String str = "20320";
//        StringBuilder newStr = new StringBuilder("");
//        soln(str, newStr, arrmap, 0 );
//    }
//    public static void soln(String str, StringBuilder newStr, String arrmap[], int i){
//        if(str.charAt(str.length()-1)=='0'){
//            System.out.println("enter vaild number!");
//            return;
//        }
//        if( i == str.length() ){
//            System.out.println(newStr);
//            return;
//        }
//        int index = str.charAt(i) - '0';
//        newStr.append(arrmap[index]+" ");
//        soln(str, newStr, arrmap, i+1);
//    }
//}

