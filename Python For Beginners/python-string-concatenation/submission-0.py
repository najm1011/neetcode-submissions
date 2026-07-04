def concatenate(s1: str, s2: str) -> str:
    newWord = s1 + s2

    if len(newWord) > 10:
        return "Too long!"
    
    return newWord




# do not modify below this line
print(concatenate("He", "llo"))
print(concatenate("Hello ", "world!"))
print(concatenate("Length", "of10"))
