package dp;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/10.
 */
public class SolutionDP4Test {
    @Test
    public void rob() throws Exception {
        int[] data = {1,2,3,4,5};
        SolutionDP4 solutionDP4 = new SolutionDP4();
        System.out.println(solutionDP4.rob(data));
    }

}