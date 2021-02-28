package sort;

public class HeapSort {

    public void heapSort(int[] nums) {
        // 创建堆
        for (int i = (nums.length - 1) / 2; i >= 0; i--) {
            adjustHead(nums, i, nums.length);
        }
        // 调整堆结构 + 交换堆顶元素与末尾元素
        for (int i = nums.length - 1; i > 0; i--) {
            // 将堆顶元素与末尾元素进行交换
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;

            // 重新对堆进行调整
            adjustHead(nums, 0, i);
        }
    }

    public void adjustHead(int[] nums, int parent, int length) {
        int temp = nums[parent];
        int lChild = parent * 2 + 1;   // left child
        while (lChild < length) {
            int rChild = lChild + 1;  // right child
            // 选取两个节点中值较大的那个
            if (rChild < length && nums[lChild] < nums[rChild])
                lChild++;
            // 如果父节点的值已经大于孩子节点的值，则直接结束
            if (temp >= nums[lChild])
                break;
            nums[parent] = nums[lChild];
            // 选取孩子节点的左孩子节点，继续向下筛选
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
