//Question 3 :
//Swapping Nodes in a Linked List
////We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
//swapped by changing links. Swapping data of nodes may be expensive in many situations when
////data contains many fields. It may be assumed that all keys in the linked list are distinct.
////Sample Input 1 : 1->2->3->4, x = 2, y = 4
////Sample Output 1 : 1->4->3->2
//T.C : O(n)  S.C. : O(1)
package LinkedList;

public class PracQues3 {
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
    public static void soln(int x, int y) {
        if(x==y){return;}

        Node currX = head;
        Node preX = null;
        Node currY = head;
        Node preY = null;

        while(currX!=null){
            if(currX.data==x){
                break;
            }
            preX = currX;
            currX = currX.next;
        }
        while(currY!=null){
            if(currY.data==y){
                break;
            }
            preY = currY;
            currY = currY.next;
        }

        if (currX == null || currY==null){
            System.out.println("Element is Missing");
            return;
        }

        if (preX==null){
            head = currY;
        }else{
            preX.next = currY;
        }

        if (preY==null){
            head = currX;
        }else{
            preY.next = currX;
        }

        Node temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;
    }
    public static void main(String[] args) {
        PracQues3 ll = new PracQues3();
        ll.addFirst(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.print();
        soln(4,3);
        ll.print();
    }
}
