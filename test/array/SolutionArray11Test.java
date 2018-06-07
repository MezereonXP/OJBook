package array;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/7.
 */
public class SolutionArray11Test {
    @Test
    public void rotate() throws Exception {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        SolutionArray11 solutionArray11 = new SolutionArray11();
        solutionArray11.rotate(array);
    }

}