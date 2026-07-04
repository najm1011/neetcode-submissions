class Solution:
    def anagramMappings(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        map = {}

        for j in range(len(nums2)):
            map[nums2[j]] = j

        result = []
        for i in range(len(nums1)):
            result.append(map[nums1[i]])
    
        return result