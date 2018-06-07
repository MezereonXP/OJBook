package array;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/7.
 */
public class SolutionArray10Test {

    char[][] data ={{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};

    @Test
    public void isValidSudoku() throws Exception {
        SolutionArray10 solutionArray10 = new SolutionArray10();
        solutionArray10.isValidSudoku(data);
    }

}