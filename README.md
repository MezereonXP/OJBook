# OJBook
A note of problems from leetcode
<!-- TOC -->

- [OJBook](#ojbook)
    - [35 矩阵置零](#35-矩阵置零)

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
    