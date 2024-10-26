class Solution:
    def findLUSlength(self, a: str, b: str) -> int:
        max_len = 0

        if len(a) < len(b):
            a, b = b, a

        for a_i, a_c in enumerate(a):

            t_index = -1
            if a_c in b:
                t_index = b.index(a_c)

            if t_index == -1:
                return len(a)
            else:
                if t_index < (len(b) - 1):
                    b = b[t_index + 1 :]
                else:
                    if a_i != len(a) - 1:
                        return len(a)

        return -1


if __name__ == "__main__":
    a = "aaa"
    b = "bbb"
    s = Solution()

    print(s.findLUSlength(a, b))

    a = "aba"
    b = "cdc"
    print(s.findLUSlength(a, b))

    a = "fsadafasfwf"
    b = "afwfafdadwa"
    print(s.findLUSlength(a, b))
