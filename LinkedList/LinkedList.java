package LinkedList;

import DivideNConquer.MergeSort;

public class LinkedList {
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
    public static int size ;

    public void addFirst(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 : newNode next = head
        newNode.next = head; //link

        //step3 : head = newNode
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addMiddle(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }
    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val =head.data;
            head = tail = null;
            size =0;
            return val;
        }
        Node temp = head;
        for(int i = 0; i<size-2;i++){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static int recSearch(int key){
        return helperR(head, key);
    }
    public static int helperR(Node head, int key){ //O(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helperR(head.next,key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
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
    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;
            return;
        }

        int i =  1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind ){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //Slow Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // slow fast mid node
    }
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node mid = findMid(head);
        //reverse the 2nd half of string
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        //check id equal
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // check if ll is in cycle
    public static boolean isCycle(){//floyds cycle finding algo//slow fast approcgh
        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false; //cycle doesnt exist
    }
    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean cycle =false;
        //check if it has loop
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycle = true;
                break;
            }
        }
        //if it doent have loop return
        if (cycle==false){
            return;
        }
        //intillize slow to head again
            slow = head;
            Node prev = null; //last node
        //run the loop untill fast==slow
            while(fast!=slow){
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            //change last node next == null
            prev.next =null;

    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;

    }
    public Node mergeSort(Node head){
        if(head==null || head.next == null){
            return head;
        }

        //find mid
        Node mid = getMid(head);
        //left and right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }
    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //zig zag merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
    public static void main(String[] args) {
          LinkedList ll =new LinkedList();
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(2);
//        ll.addLast(1);
//        ll.addMiddle(3, 4);
//        ll.addLast(6);

//        ll.print();
//        System.out.println(ll.removeFirst());
//        ll.print();
//        System.out.println(ll.removeLast());
//        ll.print();
//        System.out.println(ll.size);
//        System.out.println(ll.iterativeSearch(3));
//        System.out.println(ll.iterativeSearch(1212));
//        System.out.println(ll.recSearch(3));
//        System.out.println(ll.recSearch(1212));
//        ll.reverse();
//        ll.print();
//        ll.deleteNthfromEnd(3);
//        ll.print();
//        ll.deleteNthfromEnd(3);
//        ll.print();
// System.out.println(ll.isPalindrome());
//
//        head = new Node(1);
//        head.next = new Node(2);
//        Node temp = head.next;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        System.out.println(isCycle());
//        ll.print();
//        removeCycle();
//        ll.print();
//        System.out.println(isCycle());
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.print();

        //ll.head = ll.mergeSort(ll.head);
        ll.zigZag();
        ll.print();
    }
}
