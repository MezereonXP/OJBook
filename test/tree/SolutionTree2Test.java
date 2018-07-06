package tree;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/7/2.
 */
public class SolutionTree2Test {
    @Test
    public void isValidBST() throws Exception {
        TreeNode root = new TreeNode(22);
        root.left = new TreeNode(-4);
        root.left.left = new TreeNode(-60);
        root.left.left.left = new TreeNode(-90);
        SolutionTree2 solutionTree2 = new SolutionTree2();
        Assert.assertEquals(true, solutionTree2.isValidBST(root));
        root = new TreeNode(25);
        root.left = new TreeNode(-22);
        root.right = new TreeNode(60);
        root.right.left = new TreeNode(32);
        Assert.assertEquals(true, solutionTree2.isValidBST(root));
        root = new TreeNode(3);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(10);
        root.right.left.right = new TreeNode(15);
        root.right.left.right.right = new TreeNode(45);
        Assert.assertEquals(false, solutionTree2.isValidBST(root));
    }

}