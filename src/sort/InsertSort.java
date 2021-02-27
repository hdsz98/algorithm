package sort;

public class InsertSort {
    public void insertSort(int[] nums) {
        int j;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] < nums[i - 1]) {
                int temp = nums[i];
                j = i - 1;
                for (; j >= 0 && temp < nums[j]; j--)
                    nums[j + 1] = nums[j];
                nums[j + 1] = temp;
            }
        }
        return;
    }

    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new InsertSort().insertSort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
