package com;

import java.util.ArrayList;

public class leetcode142 {

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode a = new ListNode(2);
        a.next = new ListNode(0);
        a.next.next = new ListNode(-4);
        a.next.next.next  = a;
        head.next=a;
        ListNode result = detectCycle(head);
        System.out.println(result);
    }

    private static ListNode detectCycle(ListNode head) {
        ArrayList<ListNode> pos = new ArrayList<>();
        ListNode newNode = head;

        while (newNode != null){
            if (pos.contains(newNode)) return newNode;
            pos.add(newNode);
            newNode = newNode.next;
        }
        return null;
    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}
