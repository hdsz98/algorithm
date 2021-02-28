package sort;

public class QuickSort {
    public int partition(int[] nums, int low, int high) {
        int temp = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= temp)
                high--;
            nums[low] = nums[high];
            while (low < high && nums[low] <= temp)
                low++;
            nums[high] = nums[low];
        }
        nums[low] = temp;
        return low;
    }
    public void qSort(int[] nums, int low, int high) {
        if (low < high) {
            int temp = partition(nums, low, high);
            qSort(nums, low, temp - 1);
            qSort(nums, temp + 1, high);
        }
        return;
    }
    public void quickSort(int[] nums) {
        qSort(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new QuickSort().quickSort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
