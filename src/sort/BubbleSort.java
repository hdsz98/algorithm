package sort;

public class BubbleSort {
    public void bubblesort(int[] nums) {
        int temp, n = nums.length - 1, flag = 1;
        while (n > 0 && flag == 1) {
            flag = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[i + 1]) {
                    flag = 1;
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            n--;
        }
        return;
    }
    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new BubbleSort().bubblesort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
