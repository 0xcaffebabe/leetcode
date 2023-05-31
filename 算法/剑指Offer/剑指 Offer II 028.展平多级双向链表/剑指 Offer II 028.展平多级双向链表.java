/*
 * @lc app=leetcode.cn id=剑指 Offer II 028 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 028] 展平多级双向链表
 * 
 * 26/26 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.58 % of java submissions (39.6 MB)
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    List<Node> list = new ArrayList<>();
    public Node flatten(Node head) {
        dfs(head);
        if (list.size() == 0) return null;
        for(int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
            list.get(i + 1).prev = list.get(i);
            list.get(i).child = null;
        }
        return list.get(0);
    }
    void dfs(Node root) {
        if (root == null) return;
        list.add(root);
        dfs(root.child);
        dfs(root.next);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4,5,6,null,null,null,7,8,9,10,null,null,11,12]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,null,3]\n
// @lcpr case=end

// @lcpr case=start
// []\n
// @lcpr case=end

 */

