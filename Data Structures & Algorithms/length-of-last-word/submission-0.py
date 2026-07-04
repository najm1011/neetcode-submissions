class Solution:
    def lengthOfLastWord(self, s: str) -> int:
       length = s.split()
       return len(length[-1])
    