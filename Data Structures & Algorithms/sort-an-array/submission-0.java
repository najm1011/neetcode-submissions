// Solution.java  (heap sort variant)
class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // 1. Build a max-heap. Start at the last non-leaf node and sift down.
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(nums, i, n);
        }

        // 2. Repeatedly swap the max (root) to the end, shrink the heap, re-heapify.
        for (int end = n - 1; end > 0; end--) {
            swap(nums, 0, end);
            siftDown(nums, 0, end);
        }

        return nums;
    }

    private void siftDown(int[] nums, int i, int size) {
        while (true) {
            int largest = i;
            int leftChild  = 2 * i + 1;
            int rightChild = 2 * i + 2;

            if (leftChild  < size && nums[leftChild]  > nums[largest]) largest = leftChild;
            if (rightChild < size && nums[rightChild] > nums[largest]) largest = rightChild;

            if (largest == i) break;    // heap property restored
            swap(nums, i, largest);
            i = largest;                // follow the value down
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}