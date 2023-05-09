/*
 * @lc app=leetcode.cn id=863 lang=java
 * @lcpr version=21907
 *
 * [863] 二叉树中所有距离为 K 的结点
 * 
 * 57/57 cases passed (11 ms)
 * Your runtime beats 34.97 % of java submissions
 * Your memory usage beats 92.11 % of java submissions (40.9 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    @Override
    public String toString() {
        return val + "";
    }
}
class Solution {
    List<Integer> ans = new ArrayList<>();
    Map<TreeNode, List<TreeNode>> graph = new HashMap<>();
    boolean[] visted = new boolean[501];

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // 转成图
        travel(root);
        // System.out.println(graph.toString());
        dfs(target, k);
        return ans;
    }

    private void travel(TreeNode root) {
        if (root == null) return;
        graph.computeIfAbsent(root, key -> new ArrayList<>());
        if (root.left != null) {
            // 父与子的连接
            graph.get(root).add(root.left);
            // 子与父的连接
            graph.computeIfAbsent(root.left, key -> new ArrayList<>());
            graph.get(root.left).add(root);
            travel(root.left);
        }
        if (root.right != null) {
            graph.get(root).add(root.right);
            graph.computeIfAbsent(root.right, key -> new ArrayList<>());
            graph.get(root.right).add(root);
            travel(root.right);
        }
    }

    private void dfs(TreeNode root, int counter) {
        if (root == null) return;
        if (visted[root.val]) return;

        if (counter == 0) {
            ans.add(root.val);
            return;
        }
        var connected = graph.get(root);
        if (connected != null) {
            
            for(var c: connected) {
                visted[root.val] = true;
                dfs(c, counter - 1);
                visted[root.val] = false;
            }
            
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n5\n2\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n3\n
// @lcpr case=end

// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n7\n4\n
// @lcpr case=end

// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n7\n3\n
// @lcpr case=end

// @lcpr case=start
// [3,5,1,6,2,0,8,null,null,7,4]\n7\n8\n
// @lcpr case=end


 */

