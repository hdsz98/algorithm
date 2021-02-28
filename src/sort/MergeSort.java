package sort;

public class MergeSort {

    public void merge (int[] nums, int low, int mid, int high, int[] temp) {
        int i = 0, j = low, k = mid + 1;
        while (j <= mid && k <= high) {
            if (nums[j] < nums[k])
                temp[i++] = nums[j++];
            else
                temp[i++] = nums[k++];
        }
        while (j <= mid)
            temp[i++] = nums[j++];
        while (k <= high)
            temp[i++] = nums[k++];
        for (int t = 0; t < i; t++)
            nums[low + t] = temp[t];
    }

    public void mergeSort (int[] nums, int low, int high, int[] temp) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(nums, low, mid, temp);
            mergeSort(nums, mid + 1, high, temp);
            merge(nums, low, mid, high, temp);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        int[] temp = new int[nums.length];
        new MergeSort().mergeSort(nums, 0, nums.length - 1, temp);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
