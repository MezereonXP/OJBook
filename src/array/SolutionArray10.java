package array;/**
 * Created by Administrator on 2018/6/7.
 */

/**
 * @program: SolutionArray10
 * @description: Solution for array 10 in leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/6/7
 **/
public class SolutionArray10 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.' &&
                        (!checkLine(board, board[i][j], i, j) || !check(board, board[i][j], i, j))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean check(char[][] board, char c, int a, int b) {
        int xStart = 3 * (a / 3);
        int yStart = 3 * (b / 3);
        for (int i = xStart; i < xStart + 3; i++) {
            for (int j = yStart; j < yStart; j++) {
                if (board[i][j] == c && i != a && j != b) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkLine(char[][] board, char c, int i, int j) {
        for (int p = 0; p < board[i].length; p++) {
            if (p != j && board[i][p] == c) {
                return false;
            }
            if (p != i && board[p][j] == c) {
                return false;
            }
        }
        return true;
    }
}
