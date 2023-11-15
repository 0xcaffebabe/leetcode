/*
 * @lc app=leetcode.cn id=1652 lang=java
 * @lcpr version=
 *
 * [1652] 拆炸弹
 * 
 * 74/74 cases passed (1 ms)
 * Your runtime beats 55.28 % of java submissions
 * Your memory usage beats 86.43 % of java submissions (40 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if (k > 0) {
            for(int i = 0; i < code.length; i++) {
                for(int j = 1; j <= k; j++) {
                    ans[i] += code[(j + i) % code.length];
                }
            }
        } else if (k < 0) {
            k = -k;
            for(int i = 0; i < code.length; i++) {
                for(int j = 1; j <= k; j++) {
                    ans[i] += code[(i - j + code.length) % code.length];
                }
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,7,1,4]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n0\n
// @lcpr case=end

// @lcpr case=start
// [2,4,9,3]\n-2\n
// [2,4,9,3]\n-1\n
// [2,4,9,3]\n1\n
// @lcpr case=end

 */

