/*
 * @lc app=leetcode.cn id=117 lang=java
 *
 * [117] 填充每个节点的下一个右侧节点指针 II
 * 
 * 55/55 cases passed (3 ms)
 * Your runtime beats 18.31 % of java submissions
 * Your memory usage beats 30.27 % of java submissions (41.2 MB)
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    private List<List<Node>> tmp = new ArrayList<>(16);
    public Node connect(Node root) {
        travel(root, 0);
        for(var list: tmp) {
            for(int i = 1; i < list.size(); i++) {
                list.get(i - 1).next = list.get(i);
            }
        }
        return root;
    }

    private void travel(Node root, int level) {
        if (root == null) return;
        if (level <= tmp.size()) tmp.add(new ArrayList<>());
        tmp.get(level).add(root);
        travel(root.left, level + 1);
        travel(root.right, level + 1);
    }
}
// @lc code=end

