/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N 叉树的最大深度
 * 
 * 38/38 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 43.76 % of java submissions (41.6 MB)
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int ans = 0;
    public int maxDepth(Node root) {
        travel(root, 1);
        return ans;
    }
    void travel(Node root, int level) {
        if (root == null) return;
        ans = Math.max(ans, level);
        if (root.children != null) {
            for(var c: root.children) travel(c, level + 1);
        }
    }
}
// @lc code=end

