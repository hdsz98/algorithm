package sort.review;

public class HeapSort {
    public void heapSort(int[] nums) {
        int n = nums.length;
        for (int i = (nums.length - 1) / 2; i >= 0; i--)
            adjustHeap(nums, i, n);

        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            adjustHeap(nums, 0, i);
        }

    }

    public void adjustHeap(int[] nums, int parent, int length) {
        int temp = nums[parent];
        int lChild = parent * 2 + 1;
        while (lChild < length) {
            int rChild = lChild + 1;
            if (rChild < length && nums[rChild] > nums[lChild])
                lChild++;
            if (temp > nums[lChild])
                break;

            nums[parent] = nums[lChild];
            parent = lChild;
            lChild = 2 * lChild + 1;
        }
        nums[parent] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 66, 4, 99, 100, 2};
        new HeapSort().heapSort(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);
    }
}
