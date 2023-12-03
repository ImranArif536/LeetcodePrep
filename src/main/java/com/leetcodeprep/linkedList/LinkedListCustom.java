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
        nodeCount++;
        return head;
    }

    public V get(int index){
        LinkedListNode temp = head;
        while(index -- > 0){
            temp = temp.next;
        }
        return temp.value;
    }

    class LinkedListNode{
        public V value;
        public LinkedListNode next;
    }
}
