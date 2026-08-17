// Solution.java
class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;                // 0 or 1 element = sorted

        int mid = left + (right - left) / 2;      // overflow-safe
        mergeSort(nums, left, mid);               // sort left half
        mergeSort(nums, mid + 1, right);          // sort right half
        merge(nums, left, mid, right);            // combine the two halves
    }

    private void merge(int[] nums, int left, int mid, int right) {
        // 1. Copy the two halves into their own small arrays
        int[] L = new int[mid - left + 1];
        int[] R = new int[right - mid];

        for (int x = 0; x < L.length; x++) L[x] = nums[left + x];
        for (int x = 0; x < R.length; x++) R[x] = nums[mid + 1 + x];

        // 2. Two readers, one writer
        int i = 0;        // reader on L
        int j = 0;        // reader on R
        int k = left;     // writer back into nums

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {                   // <= keeps the sort stable
                nums[k++] = L[i++];
            } else {
                nums[k++] = R[j++];
            }
        }

        // 3. Whatever is left over goes straight across
        while (i < L.length) nums[k++] = L[i++];
        while (j < R.length) nums[k++] = R[j++];
    }
}