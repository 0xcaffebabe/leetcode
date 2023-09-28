/*
 * @lc app=leetcode.cn id=2697 lang=java
 * @lcpr version=
 *
 * [2697] 字典序最小回文串
 * 
 * 4519/4519 cases passed (7 ms)
 * Your runtime beats 85.16 % of java submissions
 * Your memory usage beats 68.68 % of java submissions (43.1 MB)
 */

// @lc code=start
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int p = 0;
        int q = s.length() - 1;
        while(p < q) {
            if (arr[p] > arr[q]) arr[p] = arr[q];
            else arr[q] = arr[p];
            p++;
            q--;
        }
        return new String(arr);
    }
}
// @lc code=end



/*
// @lcpr case=start
// "egcfe"\n
// @lcpr case=end

// @lcpr case=start
// "abcd"\n
// "zxc"\n
// "zx"\n
// "ax"\n
// "ab"\n
// "z"\n
// @lcpr case=end

// @lcpr case=start
// "seven"\n
// @lcpr case=end

 */

