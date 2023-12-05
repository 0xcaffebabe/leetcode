/*
 * @lc app=leetcode.cn id=1028 lang=java
 * @lcpr version=
 *
 * [1028] 从先序遍历还原二叉树
 * 
 * 105/105 cases passed (7 ms)
 * Your runtime beats 25.34 % of java submissions
 * Your memory usage beats 17.12 % of java submissions (42.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
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
    String traversal;
    // value, depth
    List<int[]> nodeList = new ArrayList<>();
    int cur = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        this.traversal = traversal;
        toNodeList();
        // for(var i : nodeList) System.out.println(Arrays.toString(i));
        return dfs(0);
    }

    TreeNode dfs(int depth) {
        if (cur >= nodeList.size()) return null;
        if (nodeList.get(cur)[1] != depth) {
            cur--;
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = nodeList.get(cur)[0];
        cur++;
        root.left = dfs(depth + 1);
        cur++;
        root.right = dfs(depth + 1);
        return root;
    }

    void toNodeList() {
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < traversal.length(); i++) {
            char c = traversal.charAt(i);
            if (c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    nodeList.add(new int[]{Integer.parseInt(sb.toString()), depth});
                    sb = new StringBuilder();
                    depth = 1;
                } else {
                    depth++;
                }
            }
        }
        nodeList.add(new int[]{Integer.parseInt(sb.toString()), depth});
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1-2--3--4-5--6--7"\n
// "1-2--3---4-5--6---7"\n
// "1"\n
// "1-2"\n
// "1-2--3"\n
// @lcpr case=end

// @lcpr case=start
// "1-2--3---4-5--6---7"\n
// @lcpr case=end

// @lcpr case=start
// "1-401--349---90--88"\n
// @lcpr case=end

 */

