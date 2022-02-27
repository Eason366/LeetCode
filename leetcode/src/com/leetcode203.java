package com;

public class leetcode203 {

    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        ListNode head = new ListNode();
        for (int n :nums) {
            head = new ListNode(n,head);
        }
        ListNode result = removeElements(head,7);
        System.out.println(result);
    }

    private static ListNode removeElements(ListNode head, int val) {
        ListNode newNode = new ListNode(-1,head);
        ListNode tempNode = newNode;
        ListNode headNode = head;
        while (headNode != null){
            if (headNode.val == val){
                tempNode.next = headNode.next;
            }else {
                tempNode = headNode;
            }
            headNode = headNode.next;

        }
        return newNode.next;
    }


    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
