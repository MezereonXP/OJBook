# from cv2 import exp


class Solution:
    def diffWaysToCompute(self, expression: str):
        def dfs(expr):
            print(expr)
            if expr.isdigit() or (
                len(expr) > 0 and expr[0] == "-" and expr[1:].isdigit()
            ):
                return [int(expr)]
            ans = []
            firstNumber = ""
            op = ""
            idx = 0
            for i, x in enumerate(expr):
                if x.isdigit() or i == 0:
                    firstNumber += x
                else:
                    op = x
                    idx = i
                    break
            # a*()
            tmp_arr = dfs(expr[idx + 1 :])
            for v in tmp_arr:
                ans.append(eval("{}{}{}".format(firstNumber, op, v)))
            # (a*b)()
            nextNumber = ""
            nextIdx = idx + 1
            for i, x in enumerate(expr[idx + 1 :]):
                if x.isdigit() or i == 0:
                    nextNumber += x
                    nextIdx += 1
                else:
                    break
            # print(firstNumber, op, nextNumber, str(eval("{}{}{}".format(firstNumber, op, nextNumber))) + expr[nextIdx:])
            if nextIdx < len(expr):
                ans += dfs(
                    str(eval("{}{}{}".format(firstNumber, op, nextNumber)))
                    + expr[nextIdx:]
                )
            return ans

        return dfs(expression)


if __name__ == "__main__":
    sol = Solution()
    inp = ""
    print(sol.diffWaysToCompute(inp))
