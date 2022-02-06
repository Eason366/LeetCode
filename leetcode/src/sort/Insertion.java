package sort;

public class Insertion {

    public static int[] sort(int[] nums) {
        for (int i=1; i<nums.length;i++){
            int temp = nums[i];
            int j=i-1;
            for (; j>=0&&temp<nums[j];j--){
                nums[j+1]=nums[j];
                nums[j] =temp;
            }
        }
        return nums;
    }

}
