package sort.review;

public class InsertSort {
    public void insertSort(int[] nums) {
        int j, temp;
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            for (j = i - 1; j >= 0 && nums[j] > temp; j--)
                nums[j + 1] = nums[j];
            nums[j + 1] =  temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new InsertSort().insertSort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
