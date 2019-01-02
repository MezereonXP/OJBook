package array;

import java.util.Arrays;

public class Solution35 {

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

    public static void main(String[] args) {
        int[][] m = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        Solution35 solution35 = new Solution35();
        solution35.setZeroes3(m);
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }

    }
}
