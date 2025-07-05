//Odd Even Linked List
//We have a Linked List of integers, write a function to modify the linked list such that all even
//numbers appear before all the odd numbers in the modified linked list. Also, keep the order of
//even and odd numbers same.
//Sample Input 1 : 8->12->10->5->4->1->6->NULL
//Sample Output 1 : 8->12->10->4->6->5->1->NULL

package LinkedList;
public class PracQues4 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void segregateEvenOdd() {
        if (head == null) return;

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node curr = head;

        // Traverse the list and separate even and odd nodes
        while (curr != null) {
            if (curr.data % 2 == 0) { // Even node
                if (evenHead == null) {
                    evenHead = evenTail = curr;
                } else {
                    evenTail.next = curr;
                    evenTail = evenTail.next;
                }
            } else { // Odd node
                if (oddHead == null) {
                    oddHead = oddTail = curr;
                } else {
                    oddTail.next = curr;
                    oddTail = oddTail.next;
                }
            }
            curr = curr.next;
        }

        // If there are no even elements or no odd elements, return
        if (evenHead == null || oddHead == null) return;

        // Merge even and odd lists
        evenTail.next = oddHead;
        oddTail.next = null; // Ensure the last node points to NULL

        // Update head to the new evenHead
        head = evenHead;
    }

    public static void main(String[] args) {
        PracQues4 ll = new PracQues4();
        ll.addLast(8);
        ll.addLast(12);
        ll.addLast(10);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(1);
        ll.addLast(6);

        System.out.println("Original List:");
        ll.print();

        segregateEvenOdd();

        System.out.println("Modified List:");
        ll.print();
    }
}
