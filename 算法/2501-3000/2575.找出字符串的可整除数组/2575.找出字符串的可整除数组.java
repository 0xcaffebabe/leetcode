/*
 * @lc app=leetcode.cn id=2575 lang=java
 * @lcpr version=
 *
 * [2575] 找出字符串的可整除数组
 * 
 * 51/51 cases passed (9 ms)
 * Your runtime beats 45.9 % of java submissions
 * Your memory usage beats 40.99 % of java submissions (56.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] ans = new int[word.length()];
        long sum = 0;
        for(int i = 0; i < word.length(); i++) {
            sum = (sum * 10 + word.charAt(i) - '0') % m;
            if (sum == 0) 
                ans[i] = 1;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "998244353"\n3\n
// "91221181269244172125025075166510211202115152121212341281327"\n21\n
// @lcpr case=end

// @lcpr case=start
// "1010"\n10\n
// @lcpr case=end

 */

