class Solution:
    def countElements(self, arr: List[int]) -> int:
        count = 0
        seen = set(arr)
        for x in arr:
            if (x + 1) in seen:
                count += 1
        return count