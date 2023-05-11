/*
 * @lc app=leetcode.cn id=988 lang=java
 * @lcpr version=21907
 *
 * [988] 从叶结点开始的最小字符串
 * 
 * 69/69 cases passed (11 ms)
 * Your runtime beats 10.68 % of java submissions
 * Your memory usage beats 5.34 % of java submissions (42.9 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    List<String> list = new ArrayList<>();
    public String smallestFromLeaf(TreeNode root) {
        dfs(root, "");
        list.sort(String::compareTo);
        // System.out.println(list);
        return list.get(0);
    }

    private void dfs(TreeNode root, String path) {
        if (root == null) return;
        path += (char)(root.val + 'a') + "";
        dfs(root.left, path);
        dfs(root.right, path);
        if (root.left == null && root.right == null) 
            list.add(new StringBuilder(path).reverse().toString());
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,2,3,4,3,4]\n
// @lcpr case=end

// @lcpr case=start
// [25,1,3,1,3,0,2]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,1,null,1,0,null,0]\n
// @lcpr case=end

 */

