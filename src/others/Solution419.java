package others;

/**
 * @ClassName Solution419
 * @Description 甲板上的战舰
 * @Author User
 * @Date 2019/3/29 14:53
 * @Version 1.0
 **/
public class Solution419 {
    public int countBattleships(char[][] board) {
        if (board == null)
            return 0;
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                    board = removeShip(board, i, j);
                }
            }
        }
        return count;
    }

    public char[][] removeShip(char[][] board, int x, int y) {
        for (int i = x + 1; i < board.length; i++) {
            if (board[i][y] == '.') {
                break;
            }
            board[i][y] = '.';
        }
        for (int i = y + 1; i < board[0].length; i++) {
            if (board[x][i] == '.') {
                break;
            }
            board[x][i] = '.';
        }
        return board;
    }
}
