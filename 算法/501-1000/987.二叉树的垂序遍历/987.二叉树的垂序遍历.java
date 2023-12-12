/*
 * @lc app=leetcode.cn id=987 lang=java
 * @lcpr version=
 *
 * [987] 二叉树的垂序遍历
 * 
 * 34/34 cases passed (3 ms)
 * Your runtime beats 54.71 % of java submissions
 * Your memory usage beats 94.62 % of java submissions (40.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
class TreeNodeCarrier {
    TreeNode node;
    int x;
    TreeNodeCarrier(TreeNode node, int x) {
        this.x = x;
        this.node = node;
    }
}
class Solution {
    Map<Integer, List<TreeNodeCarrier>> treeMap = new HashMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);
        for(var enr: treeMap.entrySet()) {
            enr.getValue().sort((a,b) -> {
                if (a.x != b.x) return Integer.compare(a.x, b.x);
                return Integer.compare(a.node.val, b.node.val);
            });
        }
        var keys = new ArrayList<>(treeMap.keySet());
        keys.sort((a,b) -> Integer.compare(a, b));
        List<List<Integer>> ans = new ArrayList<>();
        for(var k: keys) {
            var list = new ArrayList<Integer>();
            var cl = treeMap.get(k);
            for(var c: cl) list.add(c.node.val);
            ans.add(list);
        }
        return ans;
    }

    void dfs(TreeNode root, int x, int y) {
        if (root == null) return;
        treeMap.computeIfAbsent(y, k -> new ArrayList<>())
            .add(new TreeNodeCarrier(root, x));
        dfs(root.left, x + 1, y - 1);
        dfs(root.right, x + 1, y + 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,9,20,null,null,15,7]\n
//  [3,1,4,0,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,6,5,7]\n
// [1]\n
// [1,2]\n
// [1,2,3]\n
// @lcpr case=end

 */

