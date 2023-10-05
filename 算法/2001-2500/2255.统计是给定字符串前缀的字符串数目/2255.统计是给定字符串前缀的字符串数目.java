/*
 * @lc app=leetcode.cn id=2255 lang=java
 * @lcpr version=
 *
 * [2255] 统计是给定字符串前缀的字符串数目
 * 
 * 123/123 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 89.06 % of java submissions (42.1 MB)
 */

// @lc code=start
class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        for(var i : words)
            if (s.startsWith(i)) ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["a","b","c","ab","bc","abc"]\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// ["a","a"]\n"aa"\n
// @lcpr case=end

 */

