package sort.review;

public class BubbleSort {
    public void bubbleSort(int[] nums) {
        int i = 0, flag = 1, temp;
        while (i < nums.length && flag == 1) {
            flag = 0;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] >nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new BubbleSort().bubbleSort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
