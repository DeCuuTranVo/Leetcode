package FlashCards.LinkedLists;

import FlashCards.Arrays.ThirdMaximumNumber;

public class MyLinkedList {
    public class SinglyListNode {
        int val;
        SinglyListNode next;
        SinglyListNode(int x) { val = x; }
    }

    private SinglyListNode head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }
    
    public int get(int index) {
        if (index >= length){
            return -1;
        }

        SinglyListNode cur = head;
        int cnt = 0;
        while (cur != null) {
            if (cnt == index) {
                return cur.val;
            }

            cur = cur.next;
            cnt++;
        }
        
        return -1;
    }
    
    public void addAtHead(int val) {
        SinglyListNode newHead = new SinglyListNode(val);
        newHead.next = head;
        head = newHead;
        length += 1;
    }
    
    public void addAtTail(int val) {
        SinglyListNode cur = head;
        SinglyListNode newTail = new SinglyListNode(val);

        if (length == 0) {
            head = newTail;
            length += 1;
            return;
        }

        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newTail;
        length += 1;
    }
    
    public void addAtIndex(int index, int val) {
        SinglyListNode cur = head;

        if (index == 0) {
            this.addAtHead(val);
            return;
        }

        if (index == this.length){
            this.addAtTail(val);
            return;
        }

        if (index > this.length) {
            return;
        }

        SinglyListNode newNode = new SinglyListNode(val);
        int cnt = 0;
        while (cur != null) {
            if (cnt + 1 == index) {
                SinglyListNode nextNode = cur.next;

                newNode.next = nextNode;
                cur.next = newNode;
                length += 1;
                return;
            }

            cur = cur.next;
            cnt++;
        }

        return;
    }

    private void deleteAtHead() {
        if (length == 0) {
            return;
        }

        head = head.next;
        length --;
    }    

    private void deleteAtTail() {
        if (length == 0) {
            return;
        }

        if (length == 1) {
            this.deleteAtHead();
        }

        SinglyListNode cur = head;
  
        while (cur.next.next !=null) {
            cur = cur.next;
        }

        cur.next = null;
        length --;
    }  
    
    public void deleteAtIndex(int index) {
        if (length == 0) {
            return;
        }

        if (index == 0) {
            this.deleteAtHead();
        }

        if (index >= this.length) {
            return;
        }

        SinglyListNode cur = head;
  
        int cnt = 0;
        while (cur != null) {
            if (cnt + 1 == index) {
                cur.next = cur.next.next;
                length --;
                return;
            }

            cur = cur.next;
            cnt++;
        }
    }    

    public String toString() {
        StringBuilder sb = new StringBuilder();
        SinglyListNode cur = head;
        while (cur != null) {
            sb.append(cur.val + " -> ");
            cur = cur.next;
        }

        sb.append("null");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {

        // //Your MyLinkedList object will be instantiated and called as such:
        // MyLinkedList obj = new MyLinkedList();
        // int param_1 = obj.get(index);
        // obj.addAtHead(val);
        // obj.addAtTail(val);
        // obj.addAtIndex(index,val);
        // obj.deleteAtIndex(index);
 
        // MyLinkedList myLinkedList = new MyLinkedList();
        // myLinkedList.addAtHead(2);
        // myLinkedList.deleteAtIndex(1);
        // System.out.println((myLinkedList.toString()));
        // myLinkedList.addAtHead(2);
        // myLinkedList.addAtHead(7);
        // myLinkedList.addAtHead(3);
        // myLinkedList.addAtHead(2);
        // myLinkedList.addAtHead(5);
        // myLinkedList.addAtTail(5);
        // System.out.println(myLinkedList.get(5));

        // System.out.println((myLinkedList.toString()));

        // myLinkedList.deleteAtIndex(6);
        // myLinkedList.deleteAtIndex(4);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(1, 0);
        System.out.println(myLinkedList.get(0));
    }  
}
