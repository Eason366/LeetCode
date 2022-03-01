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
        int size = 0;
        public MyLinkedList() {
            head = new Node(0);
            size = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= size) return -1;
            Node newNode = head;
            for (int i = 0; i <= index; i++) {
                newNode = newNode.next;
            }
            return newNode.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0,val);
        }

        public void addAtTail(int val) {
            addAtIndex(size,val);
        }

        public void addAtIndex(int index, int val) {

            if (index>size) return;

            Node pred = head;
            size++;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            Node newNode = new Node(val);
            newNode.next = pred.next;
            pred.next = newNode;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;
            Node pred = head;
            size--;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            Node newNode = pred.next.next;
            pred.next = newNode;
        }
    }

}
