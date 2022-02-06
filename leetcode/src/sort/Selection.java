package sort;

public class Selection {


    public static int[] sort(int[] nums) {
        for (int i=0; i<nums.length;i++){
            int min = i;
            for (int j=i+1; j<nums.length;j++){
                if (nums[min]>nums[j]) min = j;
            }
            if (i!=min){
                int temp = nums[min];
                nums[min]=nums[i];
                nums[i]=temp;
            }
        }
        return nums;
    }
}
