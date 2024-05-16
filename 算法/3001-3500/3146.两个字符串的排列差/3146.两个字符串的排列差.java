/*
 * @lc app=leetcode.cn id=3146 lang=java
 * @lcpr version=
 *
 * [3146] 两个字符串的排列差
 * 
 * 823/823 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 52.78 % of java submissions (41.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findPermutationDifference(String s, String t) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            ans += Math.abs(i - t.indexOf(c));
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abc"\n"bac"\n
// "a"\n"a"\n
// @lcpr case=end

// @lcpr case=start
// "abcde"\n"edbac"\n
// @lcpr case=end

 */

