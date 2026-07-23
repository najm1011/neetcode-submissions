class Solution:
    def stringShift(self, s: str, shift: List[List[int]]) -> str:
        n = len(s)
        net = 0
        for direction, amount in shift:
            net += amount if direction == 0 else -amount

        k = net % n
        return s[k:] + s[:k]