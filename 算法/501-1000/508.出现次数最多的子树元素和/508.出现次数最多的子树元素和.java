/*
 * @lc app=leetcode.cn id=508 lang=java
 *
 * [508] 出现次数最多的子树元素和
 * 
 * 58/58 cases passed (5 ms)
 * Your runtime beats 31.28 % of java submissions
 * Your memory usage beats 81.37 % of java submissions (41.5 MB)
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
    private Map<Integer, Integer> map = new HashMap<>(16);

    public int[] findFrequentTreeSum(TreeNode root) {
        travel(root);
        int max = Integer.MIN_VALUE;
        int maxNum = 0;
        for(var entry: map.entrySet()) {
            if (entry.getValue() == max) {
                maxNum++;
            }
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxNum = 1;
            }
        }
        int[] ans = new int[maxNum];
        int pos = 0;
        for(var entry: map.entrySet()) {
            if (entry.getValue() == max) ans[pos++] = entry.getKey();
        }
        return ans;
    }

    private int travel(TreeNode root) {
        if (root == null) return 0;
        int val = root.val + travel(root.left) + travel(root.right);
        map.putIfAbsent(val, 0);
        map.put(val, map.get(val) + 1);
        return val;
    }
}
// @lc code=end

