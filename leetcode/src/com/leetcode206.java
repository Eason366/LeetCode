package com;

public class leetcode206 {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        ListNode head = new ListNode();
        for (int n :nums) {
            head = new ListNode(n,head);
        }
        ListNode result = reverseList(head);
        System.out.println(result);
    }

    private static ListNode reverseList(ListNode head) {
        ListNode newNode = null;
        ListNode temp = head;
        while (temp!=null){
            newNode =  new ListNode(temp.val,newNode);
            temp = temp.next;
        }
        return newNode;
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
