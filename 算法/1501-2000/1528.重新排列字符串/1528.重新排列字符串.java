/*
 * @lc app=leetcode.cn id=1528 lang=java
 * @lcpr version=21913
 *
 * [1528] 重新排列字符串
 * 
 * 399/399 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 59.71 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans = new char[s.length()];
        for(int i = 0; i < indices.length; i++) 
            ans[indices[i]] = s.charAt(i);
        return new String(ans);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "codeleet"\n[4,5,6,7,0,2,1,3]\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n[0,1,2]\n
// "a"\n[0]\n
// @lcpr case=end

 */

