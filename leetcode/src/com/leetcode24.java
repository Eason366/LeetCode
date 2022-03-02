package com;

public class leetcode24 {

    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        ListNode head = new ListNode(nums[0]);
        for (int i = 1; i< nums.length;i++) {
            head = new ListNode(nums[i],head);
        }
        ListNode result = swapPairs(head);
        System.out.println(result);
    }

    private static ListNode swapPairs(ListNode head) {
        ListNode newNode = head;
        while (newNode!=null){
            if (newNode.next!=null){
                int temp = newNode.val;
                newNode.val = newNode.next.val;
                newNode.next.val = temp;
                newNode = newNode.next.next;
            }else break;
        }
        return head;

    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {this.val = val;this.next = next;}

    }


}
