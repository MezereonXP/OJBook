def smallestStringWithSwaps(s: str, pairs) -> str:
    isChanged = 1

    while isChanged == 1:
        isChanged = 0
        for pair in pairs:
            i, j = pair
            if s[i] > s[j]:
                tmp = list(s)
                tmp[i], tmp[j] = tmp[j], tmp[i]
                s = str(tmp)
                isChanged = 1
            print(s)

    return s


if __name__ == "__main__":
    s = "dcab"
    l = [[0, 3], [1, 2]]
    print(smallestStringWithSwaps(s, l))
