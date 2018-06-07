package array;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/6.
 */
public class SolutionArray4Test {
    @Test
    public void containsDuplicate() throws Exception {
        int[] data = {1, 2, 3, 1};
        SolutionArray4 solutionArray4 = new SolutionArray4();
        Assert.assertEquals(solutionArray4.containsDuplicate(data), true);
    }

}