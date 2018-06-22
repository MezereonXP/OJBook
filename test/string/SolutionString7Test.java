package string;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionString7Test {

    @Test
    public void strStr() {
        SolutionString7 solutionString7 = new SolutionString7();
        Assert.assertEquals(solutionString7.strStr("hello", "o"), 4);
        Assert.assertEquals(solutionString7.strStr("", "a"), -1);
        Assert.assertEquals(solutionString7.strStr("mississippi", "issip"), 4);
    }
}