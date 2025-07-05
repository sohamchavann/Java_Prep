//Delete N Nodes After M Nodes of a Linked List
//We have a linked list and two integers M and N. Traverse the linked list such that you retain M
//nodes then delete next N nodes, continue the same till end of the linked list
//Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8
//Sample Output 1 : 1->2->5->6
//Sample Input 2 : M=3 N=2 LL: 1->2->3->4->5->6->7->8->9->10
//Sample Output 2 : 1->2->3->6->7->8
package LinkedList;

public class PracQues2 {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node deleteNAfterM(Node head, int M, int N) {
        Node current = head;

        while (current != null) {
            // Retain M nodes
            for (int i = 1; i < M && current != null; i++) {
                current = current.next;
            }

            if (current == null || current.next == null) {
                return head;
            }

            // Delete N nodes
           Node temp = current.next;
            for (int i = 0; i < N && temp != null; i++) {
                temp = temp.next;
            }

            // Link remaining nodes
            current.next = temp;
            current = temp; // Move current forward
        }

        return head;
    }
    public static void main(String[] args) {
        PracQues2 ll = new PracQues2();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.print();
        deleteNAfterM(head, 3,2);
        ll.print();
    }
}
