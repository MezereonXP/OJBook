package array;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/5.
 */
public class SolutionArray2Test {
    @Test
    public void maxProfit() throws Exception {
        int[] data1 = {7,1,5,3,6,4};
        int[] data2 = {1,2,3,4,5};
        int[] data3 = {7,6,4,3,1};
        SolutionArray2 solutionArray2 = new SolutionArray2();
        Assert.assertEquals(solutionArray2.maxProfit(data1), 7);
        Assert.assertEquals(solutionArray2.maxProfit(data2), 4);
        Assert.assertEquals(solutionArray2.maxProfit(data3), 0);
    }

}