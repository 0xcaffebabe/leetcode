import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1609 lang=java
 *
 * [1609] 奇偶树
 * 
 * 105/105 cases passed (17 ms)
 * Your runtime beats 15.51 % of java submissions
 * Your memory usage beats 5.3 % of java submissions (76.7 MB)
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
    List<List<Integer>> tmp = new ArrayList<>();
    boolean ans = true;
    public boolean isEvenOddTree(TreeNode root) {
        tmp.add(new ArrayList<>());
        travel(root, 1);
        // System.out.println(tmp);
        return ans;
    }
    void travel(TreeNode root, int level) {
        if (root == null) return;
        if (!ans) return;
        if (tmp.size() <= level) tmp.add(new ArrayList<>());
        var list = tmp.get(level);
        if (root.val % 2 == 0 && level % 2 != 0) {
            ans = false;
            return;   
        }
        if (root.val % 2 == 1 && level % 2 != 1) {
            ans = false;
            return;
        }
        if (list.size() != 0) {
            // 递减
            if (level % 2 == 0 && list.get(list.size() - 1) <= root.val) {
                ans = false;
                return;
            }
            // 递增
            if (level % 2 == 1 && list.get(list.size() - 1) >= root.val) {
                ans = false;
                return;
            }
        }
        list.add(root.val);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

