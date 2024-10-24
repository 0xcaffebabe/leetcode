/*
 * @lc app=leetcode.cn id=3175 lang=java
 * @lcpr version=
 *
 * [3175] 找到连续赢 K 场比赛的第一位玩家
 * 
 * 684/684 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 78.57 % of java submissions (59.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        int ans = 0;
        int win = 0;
        for(int i = 1; i < n; i++) {
            if (skills[ans] > skills[i]) {
                win++;
            } else {
                win = 1;
                ans = i;
            }
            if (win == k) return ans;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,6,3,9]\n2\n
// [16,4,7,17]\n562084119\n
// @lcpr case=end

// @lcpr case=start
// [2,5,4]\n3\n
// @lcpr case=end

 */

