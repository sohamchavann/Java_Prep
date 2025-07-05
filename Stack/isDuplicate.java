package Stack;

import java.util.Stack;

public class isDuplicate {
    public static boolean soln(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            //closing
            if(ch==')'){
                int cnt = 0;
                while (s.peek() != '('){
                    s.pop();
                    cnt++;
                }
                if (cnt<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //valid string
        String str = "((a+b))"; //true
        String str2 = " (a-b)";
        System.out.println(soln(str2));
    }
}
