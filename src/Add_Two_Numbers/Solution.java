package Add_Two_Numbers;

public class Solution {
	
	
	public static void main(String[] args) {
		ListNode l1  = new ListNode(9,new ListNode(9,new ListNode(9)));
		ListNode l2  = new ListNode(9);
		ListNode result = addTwoNumbers(l1,l2);
		
		
	}
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int num = 0;
		return addTwoNumbers(l1, l2, num);
	        
	    }
	private static ListNode addTwoNumbers(ListNode l1, ListNode l2, int num) {
		int d;
		int t;
		
		if(l1 == null && l2 == null && num ==0) return null;
		else if (l1 == null && l2 == null && num !=0) {
			return new ListNode(1,null);
		}
		else if(l1 != null && l2 == null) {
			num += l1.val;
			if(num >= 10) {
				d = num%10;
				t = 1;
			}
			else {
				d = num;
				t = 0;
			}
			return new ListNode(d,addTwoNumbers(l1.next, l2, t));
		}
		else if(l1 == null && l2 != null) {
			num += l2.val;
			if(num >= 10) {
				d = num%10;
				t = 1;
			}
			else {
				d = num;
				t = 0;
			}
			return new ListNode(d,addTwoNumbers(l1, l2.next, t));
		}
		else num += l1.val+l2.val;
		
		if(num >= 10) {
			d = num%10;
			t = 1;
		}
		else {
			d = num;
			t = 0;
		}
		return new ListNode(d,addTwoNumbers(l1.next, l2.next, t));
	}

}

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


   
