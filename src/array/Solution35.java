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
     * 将某行某列全置为零
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
        solution35.setZeroes(m);
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }

    }
}
