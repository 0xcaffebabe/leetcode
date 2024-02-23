/*
 * @lc app=leetcode.cn id=2914 lang=java
 * @lcpr version=
 *
 * [2914] 使二进制字符串变美丽的最少修改次数
 * 
 * 577/577 cases passed (3 ms)
 * Your runtime beats 96.91 % of java submissions
 * Your memory usage beats 29.9 % of java submissions (43.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minChanges(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "1001"\n
// "11"\n
// "00"\n
// "1111"\n
// "0000"\n
// "1111"\n
// "1010"\n
// "0101"\n
// @lcpr case=end

// @lcpr case=start
// "10"\n
// "01"\n
// @lcpr case=end

// @lcpr case=start
// "0000"\n
// @lcpr case=end

 */

