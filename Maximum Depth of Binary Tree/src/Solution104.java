import javax.swing.tree.TreeNode;

/**
 * 
 */

/**
 * @author Sandeep
 *
 *         LeetCode: SQuestion 104. Maximum Depth of Binary Tree
 *
 *         https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class Solution104 {
	public int maxDepth(TreeNode root) {
		if (null == root)
			return 0;
		return 1 + (Math.max(maxDepth(root.left), maxDepth(root.right)));
	}
}
