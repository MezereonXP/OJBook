# OJBook
Leetcode 题解
<!-- TOC -->

- [OJBook](#ojbook)
    - [35 矩阵置零](#35-矩阵置零)
    - [53 最大子序和](#53-最大子序和)
    - [70 爬楼梯](#70-爬楼梯)
    - [121 买卖股票的最佳时机](#121-买卖股票的最佳时机)

<!-- /TOC -->
## 35 矩阵置零

给定一个 m x n 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用原地算法。

> 示例: 输入: 
  [
    [1,1,1],
    [1,0,1],
    [1,1,1]
  ]
  输出: 
  [
    [1,0,1],
    [0,0,0],
    [1,0,1]
  ]

1. 一个直接的解决方案是使用  O(mn) 的额外空间

    即直接声明一个相同大小的矩阵, 当原矩阵当中元素有0时将对应的行和列赋值为-1作为标记, 然后遍历再一遍原矩阵把应该是零的位置进行赋值

    ```java
        /**
         * 解决方案一, 占用O(mn)的额外空间
         *
         * @param matrix
         */
        public void setZeroes(int[][] matrix) {
            int[][] newMatrix = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        setColRowZero(newMatrix, i, j);
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = newMatrix[i][j] == -1 ? 0 : matrix[i][j];
                }
            }
        }
        /**
         * 将某行某列全置为-1
         *
         * @param newMatrix
         * @param i
         * @param j
         */
        private void setColRowZero(int[][] newMatrix, int i, int j) {
            Arrays.fill(newMatrix[i], -1);
            for (int k = 0; k < newMatrix.length; k++) {
                newMatrix[k][j] = -1;
            }
        }
    ```

2. 一个简单的改进方案是使用 O(m + n) 的额外空间
   
   即声明对应行数和列数的数组用于标记, 这样即知道了哪一行和哪一列需要被置为零, 之后再遍历赋值即可
   ```java
           /**
            * 解决方案二, 占用O(m+n)的额外空间
            * @param matrix
            */
           public void setZeroes2(int[][] matrix) {
               int[] labelForRow = new int[matrix.length];
               int[] labelForCol = new int[matrix[0].length];
       
               for (int i = 0; i < matrix.length; i++) {
                   for (int j = 0; j < matrix[0].length; j++) {
                       if (matrix[i][j] == 0) {
                           labelForRow[i] = 1;
                           labelForCol[j] = 1;
                       }
                   }
               }
               for (int i = 0; i < matrix.length; i++) {
                   for (int j = 0; j < matrix[0].length; j++) {
                       matrix[i][j] = labelForCol[j] == 1 || labelForRow[i] == 1 ? 0 : matrix[i][j];
                   }
               }
           }
    ```
    
3. 一个常数空间的解决方案
    
    即直接在原数组上进行标记, 但要注意不能将非行末或者非列末的零元素进行标记, 原因是你标记之后会抵消原有零的作用
    ```java
        /**
         * 解决方案三, 占用常数的额外空间
         * @param matrix
         */
        public void setZeroes3(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][j] = 66666;
                        for (int k = 0; k < matrix.length; k++) {
                            matrix[k][j] = matrix[k][j] == 0 ? (i == matrix.length - 1 ? 66666 : matrix[k][j]) : 66666;
                        }
                        for (int k = 0; k < matrix[0].length; k++) {
                            matrix[i][k] = matrix[i][k] == 0 ? (j == matrix[0].length - 1 ? 66666 : matrix[i][k]) : 66666;
                        }
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = matrix[i][j] == 66666 ? 0 : matrix[i][j];
                }
            }
        }
    ```

## 53 最大子序和

给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

示例:
> 输入: [-2,1,-3,4,-1,2,1,-5,4],
> 输出: 6
> 解释: 连续子数组 [4,-1,2,1] 的和最大,为6。

1. 比较tricky的解法

    原理为从一开始就开始求和, 然后记录最大值, 当和小于0的时候, 重新开始求和
    
    其中理由为, 如果这个和的值小于0, 那么必不可能是某段最大和序列的前缀
```java
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum <= 0) {
                sum = 0;
            }
        }
        return max;
    }
```

## 70 爬楼梯

假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
      
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

注意：给定 n 是一个正整数。

> 示例1:
    输入： 2
    输出： 2


1. 动态规划问题, 使用一个数组作为记录:
    
    其中note就是记录的数组, note[i]就是还剩下i阶楼梯时的到楼顶的方法数
    ```java
        public int climbStairs(int n) {
            int[] note = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    note[i] = 0;
                } else if (i == 1) {
                    note[i] = 1;
                } else if (i == 2) {
                    note[i] = 2;
                } else {
                    note[i] = note[i - 1] + note[i - 2];
                }
            }
            return note[n];
        }
    ```

## 121 买卖股票的最佳时机
给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。

如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。

注意你不能在买入股票前卖出股票

> 示例1:
    输入: [7,1,5,3,6,4]
    输出: 5
    
1. 动态规划问题

    解法为声明一个数据用于记录, 循环中不断记录最小值以及当前收益最大值, 不断利用当前收益和以往的比较, 保留较大者
    
    ```java
        public int maxProfit(int[] prices) {
            int n = prices.length;
            if (n == 0) {
                return 0;
            }
            int min = prices[0];
            int positionOfMin = 0;
            int[] note = new int[n];
            for (int i = 0; i < n; i++) {
                if (prices[i] < min) {
                    positionOfMin = i;
                    min = prices[i];
                }
                if (i == 0) {
                    note[i] = 0;
                } else if (i == 1) {
                    note[i] = prices[1] > prices[0] ? prices[1] - prices[0] : 0;
                } else {   
                    note[i] = prices[i] - prices[positionOfMin] > note[i - 1] ? (prices[i] - prices[positionOfMin]) : note[i - 1];
                }
            }
            return note[n - 1];
        }
    ```