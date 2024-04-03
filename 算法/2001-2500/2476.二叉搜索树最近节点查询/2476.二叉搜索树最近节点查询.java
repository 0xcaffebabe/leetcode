/*
 * @lc app=leetcode.cn id=2476 lang=java
 * @lcpr version=
 *
 * [2476] 二叉搜索树最近节点查询
 * 
 * 35/35 cases passed (104 ms)
 * Your runtime beats 18.23 % of java submissions
 * Your memory usage beats 17.1 % of java submissions (97 MB)
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
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        dfs(root);
        List<List<Integer>> ans = new ArrayList<>();
        // System.out.println(list);
        for(int q: queries) {
            int min = Integer.MIN_VALUE;
            int max = Integer.MAX_VALUE;
            int l = 0;
            int r = list.size() - 1;
            int m = 0;
            while(l <= r) {
                m = (l + r) / 2;
                // if (q == 191) System.out.println(list.get(m));
                // 记录一下，发现 q = 191 时走不进判等分支，排查一下是因为最外层循环用了var q，没有拆箱
                // 两个 integer 对象用 == 比较导致失败
                if (q == list.get(m)) {
                    min = list.get(m);
                    max = list.get(m);
                    break;
                } else if (q < list.get(m)) {
                    r = m - 1;
                    max = Math.min(max, list.get(m));
                } else {
                    l = m + 1;
                    min = Math.max(min, list.get(m));
                }
            }
            var list = new ArrayList<>(Arrays.asList(-1, -1));
            if (min != Integer.MIN_VALUE) list.set(0, min);
            if (max != Integer.MAX_VALUE) list.set(1, max);
            ans.add(list);
        }
        return ans;
    }

    void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [6,2,13,1,4,9,15,null,null,null,null,null,null,14]\n[2,5,16]\n
// [9,6,14,null,null,13,20,12]\n[19,10,9,17,19,6,10,19,13,6]\n
// [144,62,197,7,132,179,200,null,12,66,133,null,192,null,null,null,42,63,102,null,141,191,null,34,47,null,null,94,122,null,null,null,null,33,null,null,54,72,null,104,128,28,null,null,null,null,87,null,null,null,129]\n[81,115,180,87,15,65,188,593827,101,58,883340,168,104,88,146,75,175,147,42,45,321822,191,366959]
// @lcpr case=end

// @lcpr case=start
// [144,62,197,7,132,179,200,null,12,66,133,null,192,null,null,null,42,63,102,null,141,191,null,34,47,null,null,94,122,null,null,null,null,33,null,null,54,72,null,104,128,28,null,null,null,null,87,null,null,null,129]\n[81,115,180,87,15,65,188,593827,101,58,883340,168,104,88,146,75,175,147,42,45,321822,191,366959]
// @lcpr case=end

// @lcpr case=start
// [4,null,9]\n[3,1]\n
// @lcpr case=end

 */

