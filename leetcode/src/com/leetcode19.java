package com;

public class leetcode19 {

    public static void main(String[] args) {
        int[] nums = {1};
        ListNode head = new ListNode(nums[0]);
        for (int i = 1; i< nums.length;i++) {
            head = new ListNode(nums[i],head);
        }
        int n = 2;
        ListNode result = removeNthFromEnd(head,n);
        System.out.println(result);
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode newNode = new ListNode(-1,head);
        ListNode fast = newNode;
        ListNode slow = newNode;

        for (int i = 0; i<=n; i++){
            fast = fast.next;
        }

        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return newNode.next;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}

    }


}
