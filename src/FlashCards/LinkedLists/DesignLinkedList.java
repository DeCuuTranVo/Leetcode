package FlashCards.LinkedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import FlashCards.LinkedLists.MyLinkedList.SinglyListNode;

public class DesignLinkedList {
    public class DoublyListNode {
        int val;
        DoublyListNode next;
        DoublyListNode prev;
        DoublyListNode(int x) { val = x; }
    }

    private DoublyListNode head;
    private DoublyListNode tail;
    private int length;

    public DesignLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }
    
    public int get(int index) {
        if (index >= length || index < 0) {
            return -1;
        }

        DoublyListNode cur = head;
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
        DoublyListNode newHead = new DoublyListNode(val);

        if (length == 0) {
            head = newHead;
            tail = newHead;
            length += 1;
            return;
        }

        newHead.next = head;
        if (head != null) {
            head.prev = newHead;
        }
        head = newHead;
        length += 1;
    }
    
    public void addAtTail(int val) {
        DoublyListNode newTail = new DoublyListNode(val);

        if (length == 0) {
            head = newTail;
            tail = newTail;
            length += 1;
            return;
        }

        tail.next = newTail;
        if (tail != null) {
            newTail.prev = tail;
        }
        tail = newTail;
        length += 1;
    }

    public void addAtIndex(int index, int val) {
        DoublyListNode cur = head;

        if (index == 0) {
            this.addAtHead(val);
            return;
        }

        if (index == this.length){
            this.addAtTail(val);
            return;
        }

        if (index > this.length || index < 0) {
            return;
        }

        DoublyListNode newNode = new DoublyListNode(val);
        int cnt = 0;
        while (cur != null) {
            if (cnt + 1 == index) {
                newNode.next = cur.next;
                newNode.prev = cur;

                if (cur.next != null) {
                    cur.next.prev = newNode;
                }

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

        if (length == 1) {
            head = null;
            tail = null;
            length = 0;
            return;
        }

        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        length --;
        return;
    }    

    private void deleteAtTail() {
        if (length == 0) {
            return;
        }

        if (length == 1) {
            this.deleteAtHead();
            return;
        }

        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        }

        length --;
        return;
    }  
    
    public void deleteAtIndex(int index) {
        if (length == 0) {
            return;
        }

        if (index >= this.length || index < 0) {
            return;
        }

        if (index == 0) {
            this.deleteAtHead();
            return;
        }

        if (index == this.length - 1) {
            this.deleteAtTail();
            return;
        }

        DoublyListNode cur = head;

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
        return;
    }   

    public String toString() {
        StringBuilder sb = new StringBuilder();
        DoublyListNode cur = head;
        while (cur != null) {
            sb.append(cur.val + " <-> ");
            cur = cur.next;
        }

        sb.append("null");
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        DesignLinkedList DesignLinkedList = new DesignLinkedList();
        DesignLinkedList.addAtHead(1);
        DesignLinkedList.addAtTail(3);
        DesignLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
        DesignLinkedList.get(1);              // return 2
        DesignLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
        DesignLinkedList.get(1);              // return 3
        System.out.println(DesignLinkedList.toString());          // return "1 <-> 3 <-> null"
    }
}
