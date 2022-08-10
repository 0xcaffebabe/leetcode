/*
 * @lc app=leetcode.cn id=133 lang=java
 *
 * [133] 克隆图
 * 
 * 22/22 cases passed (23 ms)
 * Your runtime beats 99.94 % of java submissions
 * Your memory usage beats 58.04 % of java submissions (41.5 MB)
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    boolean[] vis = new boolean[100];
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) return null;
        return travel(node);
    }
    Node travel(Node node) {
        if (map.containsKey(node)) return map.get(node);
        Node ret = new Node(node.val);
        map.put(node, ret);
        if (node.neighbors != null) {
            List<Node> list = new ArrayList<>();
            for(var n : node.neighbors) {
                list.add(travel(n));
            }
            ret.neighbors = list;
        }
        return ret;
    }
}
// @lc code=end

