from typing import List

from copy import deepcopy


class Solution:
    def makesquare(self, matchsticks: List[int]) -> bool:
        def gensinglekey(arr):
            return "|" + "|".join(["_".join([str(t) for t in sorted(x)]) for x in arr])

        def genkey(arr, cur):
            ans = []
            if len(arr) == 1:
                return [cur + "|" + "-".join([str(t) for t in sorted(arr[0])])]
            for i in range(len(arr)):
                ans += genkey(
                    arr[:i] + arr[i + 1 :], "-".join([str(t) for t in sorted(arr[i])])
                )
            return ans

        memo = set()

        def dfs(candidates, cur, tar):
            # print(memo)
            if len(cur) == 4 and sum(cur[-1]) == tar:
                return True

            tmpk = gensinglekey(cur)
            if tmpk in memo:
                return False
            ans = False
            if sum(cur[-1]) == tar:
                cur.append([])
            tmps = sum(cur[-1])
            for i, c in enumerate(candidates):
                if tmps + c <= tar:
                    tmp = deepcopy(cur)
                    tmp[-1].append(c)
                    ans = ans or dfs(candidates[:i] + candidates[i + 1 :], tmp, tar)
            # ans = ans or dfs(candidates[1:], cur, tar)
            if not ans:
                keys = genkey(cur, "")
                for k in keys:
                    memo.add(k)
            return ans

        lengthSum = sum(matchsticks)
        if lengthSum % 4 != 0:
            return False
        edgeLength = lengthSum // 4

        # Simple Check
        for stick in matchsticks:
            if stick > edgeLength:
                return False
        # DFS
        print(matchsticks, edgeLength)
        return dfs(matchsticks, [[]], edgeLength)


if __name__ == "__main__":
    test_cases = [
        [3, 1, 3, 3, 10, 7, 10, 3, 6, 9, 10, 3, 7, 6, 7],
        [5, 5, 5, 5, 16, 4, 4, 4, 4, 4, 3, 3, 3, 3, 4],
        [10, 10, 10, 9, 7, 7, 7, 6, 6, 3, 3, 3, 3, 3, 1],
    ]
    so = Solution()
    for test_c in test_cases:
        print(so.makesquare(sorted(test_c, reverse=True)))
