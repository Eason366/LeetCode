package com;

public class leetcode707 {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtIndex(0,10);
        myLinkedList.addAtIndex(0,20);
        myLinkedList.addAtIndex(0,30);
        System.out.println(myLinkedList.get(0));
    }

    static class MyLinkedList {
        class Node{
            int val;
            Node next;

            Node(){}
            Node(int val){
                this.val = val;
                next = null;
            }
            Node(int val, Node next){
                this.val = val;
                this.next = next;
            }

        }

        Node head;
        Node tail;
        int size = 0;
        public MyLinkedList() {}

        public int get(int index) {
            if (size<index) return -1;
            Node newNode = head;
            int i = 0;
            while (newNode != null){
                if (i == index) return newNode.val;
                newNode = newNode.next;
                i++;
            }
            return -1;

        }

        public void addAtHead(int val) {
            if (size == 0){
                tail = head = new Node(val);
            }
            else {
                head = new Node(val,head);
            }
            size++;
        }

        public void addAtTail(int val) {
            if (size == 0){
                tail = head = new Node(val);
            }
            else {
                tail.next = new Node(val);
                tail = tail.next;
            }
            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index == size || size==0){
                addAtTail(val);
                return;
            }
            if (index>size) return;
            size++;
            if (index == 0) addAtHead(val);
            Node newNode = head;
            for (int i = 0; i < index-1; i++) {
                newNode = newNode.next;
            }
            Node add = new Node(val);
            add.next = newNode.next;
            newNode.next = add;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;

            size--;
            if (index == 0){
                head = head.next;
                return;
            }
            Node newNode = head;

            for (int i = 0; i < index-1; i++) {
                newNode = newNode.next;
            }
            newNode.next = newNode.next.next;
        }
    }

}
