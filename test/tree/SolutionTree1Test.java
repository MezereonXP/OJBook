package tree;

import linklist.SolutionLinkList4;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/7/1.
 */
public class SolutionTree1Test {
    @Test
    public void maxDepth() throws Exception {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.right = new TreeNode(7);
        node.right.left = new TreeNode(15);
        SolutionTree1 solutionTree1 = new SolutionTree1();
        Assert.assertEquals(3, solutionTree1.maxDepth(node));
        Assert.assertEquals(0, solutionTree1.maxDepth(null));
    }

}