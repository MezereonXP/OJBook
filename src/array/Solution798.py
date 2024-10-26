from typing import List


class Solution:
    def bestRotation(self, nums: List[int]) -> int:
        import numpy as np

        ans = 0
        n = len(nums)
        dp = np.array([0 for _ in range(n)])
        for i, x in enumerate(nums):
            if x <= i:
                ans += 1
                dp[n - i : n - i + x] -= 1
            else:
                dp[x - i : n - i] += 1
            print(i, x, dp)
        print(ans)
        mx = ans
        rotate_times = 0
        for i in range(1, n):
            if ans + dp[i] >= mx:
                rotate_times = i
                mx = ans + dp[i]
        if rotate_times != 0:
            rotate_times = n - rotate_times
        if mx == ans:
            rotate_times = 0

        return rotate_times


if __name__ == "__main__":
    s = Solution()
    s.bestRotation([1, 3, 0, 2, 4])
    # s.bestRotation([1, 7, 6, 3, 9, 1, 6, 3, 9, 8])
