/*
 * @lc app=leetcode.cn id=1974 lang=java
 * @lcpr version=
 *
 * [1974] 使用特殊打字机键入单词的最少时间
 * 
 * 135/135 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 46.8 % of java submissions (39.4 MB)
 */

// @lc code=start
class Solution {
    public int minTimeToType(String word) {
        int ans = 0;
        ans += diff('a', word.charAt(0)) + 1;
        for(int i = 1; i < word.length(); i++)
            ans += diff(word.charAt(i), word.charAt(i - 1)) + 1;
        return ans;
    }

    int diff(char a, char b) {
        int i = Math.abs(a - b);
        int j = Math.abs((a + 26) - b);
        int k = Math.abs(a - (b + 26));
        return Math.min(i, Math.min(j, k));
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n
// @lcpr case=end

// @lcpr case=start
// "bza"\n
// @lcpr case=end

// @lcpr case=start
// "zjpc"\n
// "gjdjhgfetojdfhgkvvdjfhjdfh"\n
// "abcdefghijklmnopqrstuvwxyz"\n
// "a"\n
// "z"\n
// @lcpr case=end

 */

