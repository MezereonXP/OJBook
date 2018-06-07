package array;

/**
 * @program: SolutionArray11
 * @description: Solution for array 10 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/7
 **/
public class SolutionArray11 {
    public void rotate(int[][] matrix) {
        int cycleNum = matrix.length/2;
        for (int i=0;i<cycleNum;i++){
            for (int j=0;j<matrix.length-1;j++){
                doCycleRotate(matrix, i);
            }
        }
    }

    private void doCycleRotate(int[][] matrix, int i) {
        int[] note = new int[4];
        note[0] = matrix[i][i];
        note[1] = matrix[i][matrix.length-1-i];
        note[2] = matrix[matrix.length-1-i][i];
        note[3] = matrix[matrix.length-1-i][matrix.length-1-i];
        for (int position=i+1;position<(matrix.length-i);position++){
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][position];
            matrix[i][position] = temp;
        }
        for (int position=i+1;position<(matrix.length-i-1);position++){
            int temp = matrix[i+1][matrix.length-1-i];
            matrix[i+1][matrix.length-1-i] = matrix[position+1][matrix.length-1-i];
            matrix[position+1][matrix.length-1-i] = temp;
        }
        matrix[i+1][matrix.length-1-i] = note[1];
        for (int position=(matrix.length-i)-2;position>=i;position--){
            int temp = matrix[matrix.length-1-i][matrix.length-2-i];
            matrix[matrix.length-1-i][matrix.length-2-i] = matrix[matrix.length-1-i][position];
            matrix[matrix.length-1-i][position] = temp;
        }
        matrix[matrix.length-1-i][matrix.length-1-i-1] = note[3];
        for (int position=(matrix.length-1-i)-2;position>=i;position--){
            int temp = matrix[matrix.length-2-i][i];
            matrix[matrix.length-2-i][i] = matrix[position][i];
            matrix[position][i] = temp;
        }
        matrix[matrix.length-2-i][i] = note[2];
    }
}
