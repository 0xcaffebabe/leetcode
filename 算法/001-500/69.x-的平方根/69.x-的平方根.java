/*
 * @lc app=leetcode.cn id=69 lang=java
 * @lcpr version=21909
 *
 * [69] x 的平方根
 * 
 * 1017/1017 cases passed (33 ms)
 * Your runtime beats 6.93 % of java submissions
 * Your memory usage beats 85.89 % of java submissions (38.5 MB) 
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        for(int i = 0;i<=46340;i++){
            if (i *i <=x && (i+1) *(i+1) > x) return i;
        }
        return 46340;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 8\n
// @lcpr case=end

 */

