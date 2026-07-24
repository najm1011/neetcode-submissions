class StringIterator:

    def __init__(self, compressedString: str):
        self.s = compressedString
        self.i = 0
        self.char = ' '
        self.remaining = 0

    def next(self) -> str:
        if not self.hasNext():
            return ' '

        if self.remaining == 0:
            # parse the next (letter, count) pair
            self.char = self.s[self.i]
            self.i += 1

            n = 0
            while self.i < len(self.s) and self.s[self.i].isdigit():
                n = n * 10 + int(self.s[self.i])
                self.i += 1
            self.remaining = n

        self.remaining -= 1
        return self.char

    def hasNext(self) -> bool:
        return self.remaining > 0 or self.i < len(self.s)