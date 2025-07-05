package Stack;

import java.util.ArrayList;

public class StackUsingAL {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        //isEmpty
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack S = new Stack();
        S.push(1);
        S.push(2);
        S.push(3);

        while(S.isEmpty()!=true){
            System.out.println(S.peek());
            S.pop();
        }
    }
}
