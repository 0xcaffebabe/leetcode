/*
 * @lc app=leetcode.cn id=LCR 152 lang=java
 * @lcpr version=
 *
 * [LCR 152] 验证二叉搜索树的后序遍历序列
 * 
 * 25/25 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 35.94 % of java submissions (40.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    int[] postorder;
    public boolean verifyTreeOrder(int[] postorder) {
        this.postorder = postorder;
        if (postorder.length < 2) return true;
        return check(0, postorder.length - 1);
    }

    boolean check(int left, int right) {
        // System.out.println(left + "|" + right);
        if (left >= right) return true;
        int root = postorder[right];
        int k = left;
        // 左子树都小于根节点
        while(k < right && postorder[k] < root) k++;

        // 检查右子树是否都大于根节点
        for(int i = k; i < right; i++)
            if (postorder[i] < root) return false;
        
        return check(left, k - 1) && check(k, right - 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,9,6,5,8]\n
// @lcpr case=end

// @lcpr case=start
// [4,6,5,9,8]\n
// [1]\n
// [1,2]\n
// [2,1]\n
// [1,2,3]\n
// @lcpr case=end

 */

