package sort;

public class InsertSortBinary {
    public void insertSortBinary(int[] nums) {
        int j, temp;
        for (int i = 1; i < nums.length; i++) {
            temp = nums[i];
            int low = 0, high = i - 1;
            while (low <= high) {
                int m = (low + high) / 2;
                if (temp < nums[m])
                    high = m - 1;
                else
                    low = m + 1;
            }
            for (j = i - 1; j >= high; j--)
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
