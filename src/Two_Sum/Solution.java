package Two_Sum;

public class Solution {
	public static void main(String[] args) {
		int[] nums = {3,3};
		for (int i : twoSum(nums,6)) {
			System.out.println(i);
		}
	}
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i,j};
				}
				
			}
			
			
		}
	
		return new int[] {};
    
    }
}
