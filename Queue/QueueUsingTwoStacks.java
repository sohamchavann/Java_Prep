package Queue;

import java.util.Stack;

public class QueueUsingTwoStacks {
    static class Queue {
         Stack <Integer> s1 = new Stack<>();
         Stack <Integer> s2 = new Stack<>();

        public  boolean isEmpty(){
            return s1.isEmpty();
        }
        public  void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public  int remove(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return s1.pop();
        }

        public  int peek(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }

    static class Queue1 {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        static void add(int data) {
            s1.push(data); // Always push to s1
        }

        static int remove() {
            if (isEmpty()) {
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop()); // Transfer s1 to s2
                }
            }
            return s2.pop();
        }

        static int peek() {
            if (isEmpty()) {
                return -1;
            }
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
