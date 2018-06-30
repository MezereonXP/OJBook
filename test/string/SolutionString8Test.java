package string;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;


public class SolutionString8Test {

    @Test
    public void longestCommonPrefix() {
        SolutionString8 solutionString8 = new SolutionString8();
        String[] strings = {"flower", "flow", "flight"};
        Assert.assertEquals(solutionString8.longestCommonPrefix(strings), "fl");
    }

}