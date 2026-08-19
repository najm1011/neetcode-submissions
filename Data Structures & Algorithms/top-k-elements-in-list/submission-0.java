


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Count
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // 2. Dump entries into a list and sort by count, highest first
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(count.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        // 3. Take the first k keys
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = entries.get(i).getKey();
        }
        return res;
    }
}