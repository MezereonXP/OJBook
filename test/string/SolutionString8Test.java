package string;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/22.
 */
public class SolutionString8Test {
    @Test
    public void countAndSay() throws Exception {
        SolutionString8 solutionString8 = new SolutionString8();
        Assert.assertEquals(solutionString8.countAndSay(12), "1112");
        Assert.assertEquals(solutionString8.countAndSay(111), "31");
        Assert.assertEquals(solutionString8.countAndSay(1), "11");
        Assert.assertEquals(solutionString8.countAndSay(0), "10");
        Assert.assertEquals(solutionString8.countAndSay(111112211), "512221");
    }

}