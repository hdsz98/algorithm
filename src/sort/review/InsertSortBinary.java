package sort.review;

public class InsertSortBinary {
    public void insertSortBinary(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int low = 0, high = i - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums[mid] < nums[i])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            int temp = nums[i];
            for (int j = i - 1; j >= high; j--)
                nums[j + 1] = nums[j];
            nums[high + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new InsertSortBinary().insertSortBinary(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
