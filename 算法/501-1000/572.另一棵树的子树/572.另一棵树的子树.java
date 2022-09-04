/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一棵树的子树
 * 
 * 182/182 cases passed (16 ms)
 * Your runtime beats 6.05 % of java submissions
 * Your memory usage beats 5 % of java submissions (42.2 MB)
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<String> list1 = new ArrayList<>(32);
        List<String> list2 = new ArrayList<>(32);
        travel(root, list1);
        travel(subRoot, list2);
        String a = "," + list1.stream().collect(Collectors.joining(",")) + ",";
        String b = "," + list2.stream().collect(Collectors.joining(",")) + ",";
        return a.contains(b);
    }

    private void travel(TreeNode root, List<String> list) {
        if (root == null) {
            list.add("null");
            return;
        }
        travel(root.left, list);
        travel(root.right, list);
        list.add(root.val + "");
    }
}
// @lc code=end

