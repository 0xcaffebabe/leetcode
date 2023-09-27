/*
 * @lc app=leetcode.cn id=2433 lang=java
 * @lcpr version=
 *
 * [2433] 找出前缀异或的原始数组
 * 
 * 46/46 cases passed (2 ms)
 * Your runtime beats 40.54 % of java submissions
 * Your memory usage beats 41.44 % of java submissions (61.8 MB)
 */

// @lc code=start
class Solution {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        ans[0] = pref[0];
        int sum = pref[0];
        for(int i = 1; i < pref.length; i++) {
            ans[i] = sum ^ pref[i];
            sum ^= ans[i];
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,2,0,3,1]\n
// [1]\n
// [0]\n
// [0,0,0]\n
// [1,1,1]\n
// [1,2]\n
// [1,1]\n
// [0,0]\n
// @lcpr case=end

// @lcpr case=start
// [13]\n
// @lcpr case=end

 */

