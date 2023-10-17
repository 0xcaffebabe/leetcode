/*
 * @lc app=leetcode.cn id=2405 lang=java
 * @lcpr version=
 *
 * [2405] 子字符串的最优划分
 * 
 * 59/59 cases passed (7 ms)
 * Your runtime beats 91.79 % of java submissions
 * Your memory usage beats 73.85 % of java submissions (43.1 MB)
 */

// @lc code=start
class Solution {
    boolean[] m = new boolean[26];
    public int partitionString(String s) {
        int ans = 1;
        for(char c : s.toCharArray()) {
            if (m[c - 'a']) {
                reset();
                ans++;
            }
            m[c - 'a'] = true;
        }
        return ans;
    }
    void reset() {
        for(int i = 0; i < m.length; i++) 
            m[i] = false;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abacaba"\n
// @lcpr case=end

// @lcpr case=start
// "ssssss"\n
// "abcdefghijklmnopqrstuvwxyz"\n
// @lcpr case=end

 */

