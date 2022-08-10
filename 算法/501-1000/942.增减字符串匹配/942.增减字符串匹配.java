/*
 * @lc app=leetcode.cn id=942 lang=java
 *
 * [942] 增减字符串匹配
 * 
 * 95/95 cases passed (3 ms)
 * Your runtime beats 32.08 % of java submissions
 * Your memory usage beats 85.01 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int low = 0;
        int high = s.length();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'I') ans[i] = low++;
            else ans[i] = high--;
        }
        ans[s.length()] = low;
        return ans;
    }
}
// @lc code=end

