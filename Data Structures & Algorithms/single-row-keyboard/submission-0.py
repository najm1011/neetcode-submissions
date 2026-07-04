class Solution:
    def calculateTime(self, keyboard: str, word: str) -> int:
        time = 0
        finger = 0
        for ch in word:
            j = keyboard.index(ch)
            time = time + abs(j - finger)
            finger = j
        return time