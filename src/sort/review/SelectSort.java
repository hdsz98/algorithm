package sort.review;

public class SelectSort {
    public void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min])
                    min = j;
            }
            if (min != i){
                int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new SelectSort().selectSort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
