//Input: x+y*z/w+u
//Output: ++x/*yzwu
package Stack;
import java.util.*;
public class InfixToPrefix {
    static String preToInfix(String pre_exp) {
        pre_exp = rev(pre_exp);
        Stack<Character> st = new Stack<>();
        String ans = "";
        int i = 0;
        int n = pre_exp.length();
        while(i<n){
            char ch = pre_exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                ans = ans + ch;
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek()!='('){
                    ans = ans + st.pop();
                }
                st.pop();
            }
            else{
                if(ch == '^'){
                    while(!st.isEmpty() && priority(ch) <= priority(st.peek())){
                        ans = ans + st.pop();
                    }
                }else{
                    while(!st.isEmpty() && priority(ch) < priority(st.peek())){
                        ans = ans + st.pop();
                    }
                }
                st.push(ch);
            }
            i++;
        }

        while(!st.isEmpty()){
            ans = ans + st.pop();
        }

        return rev(ans);
    }

    static String rev(String s){

        String r = "";
        char ch ;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(ch == '(' || ch == ')'){
                r = r + ch;
            }
            else{
                r = ch + r;
            }
        }
        return r;
    }

    static int priority(char ch){
        if(ch == '^'){
            return 3;
        }
        else if(ch == '*' || ch == '/'){
            return 2;
        }
        else if(ch == '+' || ch == '-'){
            return 1;
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(preToInfix("x+y*z/w+u"));
    }
}
