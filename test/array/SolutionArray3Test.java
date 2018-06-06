package array;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/5.
 */
public class SolutionArray3Test {

    @Test
    public void rotate() throws Exception {
        int[] data1 = {1,2,3,4,5,6,7};
        SolutionArray3 solutionArray3 = new SolutionArray3();
        solutionArray3.rotate(data1, 5);
    }

}