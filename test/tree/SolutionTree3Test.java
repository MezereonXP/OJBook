package tree;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.logging.Logger;

public class SolutionTree3Test {

    @Test
    public void isSymmetric() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        SolutionTree3 solutionTree3 = new SolutionTree3();
        Assert.assertEquals(solutionTree3.isSymmetric(root), true);
        root.right.right = new TreeNode(4);
        Assert.assertEquals(solutionTree3.isSymmetric(root), false);
        Assert.assertEquals(solutionTree3.isSymmetric(null), true);
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(3);
        Assert.assertEquals(solutionTree3.isSymmetric(root), true);
        root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.right.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        root.right.right.right = new TreeNode(6);
        Assert.assertEquals(solutionTree3.isSymmetric(root), true);

    }
}