package com.leetcodeprep.linkedList;

public class LinkedListCustom <V>{
    private LinkedListNode head;
    private LinkedListNode tail;
    private int nodeCount;

    public LinkedListNode add(V val){
        if(head == null){
            head = new LinkedListNode();
            head.value = val;
            tail = head;
        }
        else {
            this.tail.next = new LinkedListNode();
            this.tail.next.value = val;
            this.tail = this.tail.next;
        }
        this.nodeCount++;
        return head;
    }

    public V get(int index){
        LinkedListNode temp = head;
        while(index -- > 0){
            temp = temp.next;
        }
        return temp.value;
    }

    public V remove(int index){
        if(index > nodeCount || head == null){
            throw new IndexOutOfBoundsException();
        }
        if(index == 0){
            LinkedListNode t = head;
            head = head.next;
            t.next = null;
            nodeCount--;
            return t.value;
        }
        LinkedListNode temp = head;
        int i=0;
        while(i < index){
            temp = temp.next;
            i++;
        }
        LinkedListNode r = temp.next;
        temp.next = r.next;
        r.next = null;
        nodeCount--;
        return temp.next.value;
    }

    public boolean remove(V val){
        if(head == null)
            return false;
        LinkedListNode thead = new LinkedListNode();
        thead.value = null;
        thead.next = head;
        while(thead.next != null && thead.next.value != val){
            thead = thead.next;
        }
        if(thead.next == null || thead.next.value != val)
            return false;
        LinkedListNode r = thead.next;
        thead.next = r.next;
        r.next = null;
        nodeCount--;
        return true;
    }

    class LinkedListNode{
        public V value;
        public LinkedListNode next;
    }
}
