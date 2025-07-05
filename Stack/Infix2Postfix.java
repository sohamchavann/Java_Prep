package Stack;
import java.util.*;

public class Infix2Postfix {

    // FunctionExample to convert an infix expression to a postfix expression
    public static String infixToPostfix(String s) {
        StringBuilder ans = new StringBuilder(""); // StringBuilder to store the postfix expression
        Stack<Character> st = new Stack<>(); // Stack to store operators
        int i = 0;
        int n = s.length();

        // Iterate through the infix expression
        while (i < n) {
            char ch = s.charAt(i);

            // If the character is an operand (letter or digit), add it to the output
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }
            // If the character is '(', push it onto the stack
            else if (ch == '(') {
                st.push(ch);
            }
            // If the character is ')', pop from the stack until '(' is encountered
            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop()); // Append operators inside the parentheses
                }
                st.pop(); // Remove the '(' from the stack
            }
            // If an operator is encountered
            else {
                // Pop operators from the stack with higher or equal precedence
                while (!st.isEmpty() && priority(st.peek()) >= priority(ch)) {
                    ans.append(st.pop());
                }
                st.push(ch); // Push the current operator onto the stack
            }
            i++; // Move to the next character
        }

        // Pop all remaining operators from the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString(); // Return the postfix expression
    }

    // FunctionExample to define operator precedence
    public static int priority(char ch) {
        if (ch == '^') {
            return 3; // Highest precedence (exponentiation)
        } else if (ch == '*' || ch == '/') {
            return 2; // Multiplication and division have higher precedence than addition/subtraction
        } else if (ch == '+' || ch == '-') {
            return 1; // Lowest precedence
        } else {
            return -1; // Invalid character (should not occur)
        }
    }

    // Vectors method for testing
    public static void main(String[] args) {
        // Example input: Infix expression "a+b*(c^d-e)^(f+g*h)-i"
        // Expected Output: "abcd^e-fgh*+^*+i-"
        System.out.println(infixToPostfix("a+b*(c^d-e)^(f+g*h)-i"));
    }
}
