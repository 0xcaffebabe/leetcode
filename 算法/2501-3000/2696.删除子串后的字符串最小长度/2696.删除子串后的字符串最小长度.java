/*
 * @lc app=leetcode.cn id=2696 lang=java
 * @lcpr version=
 *
 * [2696] 删除子串后的字符串最小长度
 * 
 * 1541/1541 cases passed (6 ms)
 * Your runtime beats 68.84 % of java submissions
 * Your memory usage beats 23.97 % of java submissions (42.6 MB)
 */

// @lc code=start
class Solution {
    public int minLength(String s) {
        while(true) {
            var s1 = s.replace("AB", "").replace("CD", "");
            if (s1.length() == s.length()) return s1.length();
            s = s1;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "ABFCACDB"\n
// @lcpr case=end

// @lcpr case=start
// "ACBBD"\n
// "ACDBABCACDBD"\n
// @lcpr case=end

 */

