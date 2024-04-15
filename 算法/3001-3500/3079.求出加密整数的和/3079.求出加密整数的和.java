/*
 * @lc app=leetcode.cn id=3079 lang=java
 * @lcpr version=
 *
 * [3079] 求出加密整数的和
 * 
 * 865/865 cases passed (1 ms)
 * Your runtime beats 93.7 % of java submissions
 * Your memory usage beats 43.59 % of java submissions (41.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans = 0;
        for(var i : nums) ans += encrypt(i);
        return ans;
    }

    int encrypt(int i) {
        // if (i < 10) return i;
        int max = 0;
        int c = 0;
        while(i > 0) {
            max = Math.max(i % 10, max);
            i /= 10;
            c++;
        }
        int ans = max;
        for(int j = 1; j < c; j++) {
            ans = ans * 10 + max;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [10,21,31]\n
// @lcpr case=end

 */

