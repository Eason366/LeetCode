package sort;

public class Tester {
    public static void main(String[] args) {
        int[] nums = new int[] {3,44,38,5,47,15,36,27,2,46,4,19,50,48,85,73,67,55,90,87,99,65};
        nums = Insertion.sort(nums);
        for (int n :nums) {
            System.out.println(n);
        }
    }

}
