package Stack;

import java.util.Stack;

public class validParenthesis  {
    public static boolean soln(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
            if(curr == '{' || curr == '[' || curr == '('){
                s.push(curr);
            }
            else if (curr == '}' || curr == ']' || curr == ')'){
                if(s.isEmpty()){
                    return false;
                }
                char top = s.peek();
                if(curr == '}' && top == '{' ||
                        curr == ')' && top == '(' ||
                        curr == ']' && top == '['){
                    s.pop();
                }
                else return false;
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "(([{}]){}";
        System.out.println(soln(str));
    }
}
