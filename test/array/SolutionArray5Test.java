package array;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/6.
 */
public class SolutionArray5Test {
    @Test
    public void singleNumber() throws Exception {
        int[] data = {17,12,5,-6,12,4,17,-5,2,-3,2,4,5,16,-3,-4,15,15,-4,-5,-6};
        SolutionArray5 solutionArray5 = new SolutionArray5();
        Assert.assertEquals(16, solutionArray5.singleNumber(data));
    }

}