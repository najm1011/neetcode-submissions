class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        maxSoFar = -1
        max_so_far = -1
        for i in reversed(range(len(arr))):
            new_max = max(max_so_far, arr[i])
            arr[i] = max_so_far
            max_so_far = new_max
        return arr


