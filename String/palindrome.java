package String;// cheack if string is String.palindrome

public class palindrome {
    public static void main(String[] args) {
        String str = "racecar";
        int s = 212;

        System.out.println(soln(str));
    }
    public static boolean soln(String str){
        int n = str.length();
        for(int i = 0;i<n/2;i++ ){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}
