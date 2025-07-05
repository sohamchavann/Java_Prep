package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    static class Stack{
        static Deque<Integer> d = new LinkedList<>();
        static void push(int data){
            d.addLast(data);
        }
        static int pop(){
            return d.removeLast();
        }
        static int peek(){
            return d.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
