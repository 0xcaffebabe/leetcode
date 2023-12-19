/*
 * @lc app=leetcode.cn id=2096 lang=java
 * @lcpr version=
 *
 * [2096] 从二叉树一个节点到另一个节点每一步的方向
 * 
 * 332/332 cases passed (176 ms)
 * Your runtime beats 10.27 % of java submissions
 * Your memory usage beats 5.95 % of java submissions (99.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    Map<TreeNode, TreeNode> parentMap = new HashMap<>();
    int startValue;
    int destValue;
    TreeNode start;
    TreeNode dest;
    Set<Integer> visted = new HashSet<>();
    String ans;
    public String getDirections(TreeNode root, int startValue, int destValue) {
        this.startValue = startValue;
        this.destValue = destValue;
        dfs(root, null);
        dfs0(start, new StringBuilder());
        return ans;
    }

    void dfs0(TreeNode root, StringBuilder path) {
        if (root == null) return;
        if (visted.contains(root.val)) return;
        if (root == dest) {
            ans = path.toString();
            return;
        }
        path.append("U");
        visted.add(root.val);
        dfs0(parentMap.get(root), path);
        path.delete(path.length() - 1, path.length());
        visted.remove(root.val);
        if (ans != null) return;
        
        path.append("L");
        visted.add(root.val);
        dfs0(root.left, path);
        path.delete(path.length() - 1, path.length());
        visted.remove(root.val);
        if (ans != null) return;

        path.append("R");
        visted.add(root.val);
        dfs0(root.right, path);
        path.delete(path.length() - 1, path.length());
        visted.remove(root.val);
        if (ans != null) return;
    }

    void dfs(TreeNode root, TreeNode parent) {
        if (root == null) return;
        parentMap.put(root, parent);
        if (root.val == startValue) start = root;
        if (root.val == destValue) dest = root;
        dfs(root.left, root);
        dfs(root.right, root);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,1,2,3,null,6,4]\n3\n6\n
// @lcpr case=end

// @lcpr case=start
// [2,1]\n2\n1\n
// [1,2]\n2\n1\n
// [1,2,3]\n2\n3\n
// @lcpr case=end

 */

