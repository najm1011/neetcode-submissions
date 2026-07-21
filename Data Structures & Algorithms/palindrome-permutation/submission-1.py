class Solution:
    def canPermutePalindrome(self, s: str) -> bool:
        counts = Counter(s)
        odd_counts = sum(1 for char in counts if counts[char] % 2 != 0)
        if odd_counts <= 1:
            return True
        else:
            return False