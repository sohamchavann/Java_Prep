package LinkedList;

public class linklist {
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
    public void removeFirst(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        if(size==1){
            size--;
            head = tail = null;
            return;
        }
        size--;
        head = head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        if(size==1){
            size--;
            head = tail = null;
            return;
        }
        Node temp = head;
        for(int i = 0; i<size-2;i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public void addMiddle(int data, int n){
        if (n==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        for(int i = 0; i<n-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void removenthfromend(int n){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        if(n>size){
            System.out.println("enter vaild number");
            return;
        }
        if(n == size){
            removeFirst();
            return;
        }
        Node temp = head;
        for(int i = 1; i < size-n;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node mid = findMid(head);

        Node rightH = mid.next;
        mid.next = null;
        Node tempRight = rightH;
        //rev 2nd half
        Node prev = null;
        Node curr = rightH;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        rightH = prev;
        Node checkRight = rightH;
        Node leftH = head;

        while(rightH!=null){
            if(leftH.data != rightH.data){
                return false;
            }
            leftH = leftH.next;
            rightH = rightH.next;
        }

        prev = null;
        curr = checkRight;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        mid.next = prev; // Reconnect the restored part

        return true;
    }
    public boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow==fast){
                isCycle = true;
                break;
            }
        }
        if(isCycle==false){
            return;
        }
            slow = head;
            Node prev = null;
            while(slow!=fast){
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            prev.next = null;
    }

//    Delete N Nodes After M Nodes of a Linked List
//    We have a linked list and two integers M and N. Traverse the linked list such that you retain M
//    nodes then delete next N nodes, continue the same till end of the linked list. Difficulty Level:
//    Rookie.
//    Sample Input 1 : M=2 N=2 LL: 1->2->3->4->5->6->7->8
//    Sample Output 1 : 1->2->5->6
//    Sample Input 2 : M=3 N=2 LL: 1->2->3->4->5->6->7->8->9->10
//    Sample Output 2 : 1->2->3->6->7->8

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
        linklist ll = new linklist();
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
