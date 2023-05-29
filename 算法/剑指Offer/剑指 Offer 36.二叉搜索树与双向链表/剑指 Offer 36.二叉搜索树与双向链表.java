/*
 * @lc app=leetcode.cn id=剑指 Offer 36 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 36] 二叉搜索树与双向链表
 * 
 * 50/50 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 93.49 % of java submissions (39.8 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

// class Node {
//     public int val;
//     public Node left;
//     public Node right;

//     public Node() {}

//     public Node(int _val) {
//         val = _val;
//     }

//     public Node(int _val,Node _left,Node _right) {
//         val = _val;
//         left = _left;
//         right = _right;
//     }
// };
class Solution {
    List<Node> list = new ArrayList<>();
    public Node treeToDoublyList(Node root) {
        trv(root);
        if (list.size() == 0) return null;

        list.get(0).left = list.get(list.size() - 1);
        list.get(list.size() - 1).right = list.get(0);
        for(int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }
    void trv(Node root){
        if (root == null) return;
        trv(root.left);
        list.add(root);
        trv(root.right);
    }
}
// @lc code=end

/*

// @lcpr case=start
// [4,2,5,1,3]\n
// [4]\n
// []\n
// [1,2]\n
// [1,2,3]\n
// @lcpr case=end


*/

