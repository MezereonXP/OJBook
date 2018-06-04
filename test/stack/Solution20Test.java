package stack;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/4.
 */
public class Solution20Test {
    @Test
    public void isValid() throws Exception {
        Solution20 solution20 = new Solution20();
        Assert.assertEquals(solution20.isValid("{}"), true);
        Assert.assertEquals(solution20.isValid("{()}"), true);
        Assert.assertEquals(solution20.isValid("{()}("), false);
        Assert.assertEquals(solution20.isValid("([)]"), false);
        Assert.assertEquals(solution20.isValid("([)"), false);
    }

}