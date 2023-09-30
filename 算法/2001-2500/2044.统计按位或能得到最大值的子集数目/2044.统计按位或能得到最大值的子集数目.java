/*
 * @lc app=leetcode.cn id=2044 lang=java
 * @lcpr version=
 *
 * [2044] 统计按位或能得到最大值的子集数目
 * 
 * 111/111 cases passed (11 ms)
 * Your runtime beats 60.18 % of java submissions
 * Your memory usage beats 59.29 % of java submissions (38.8 MB)
 */

// @lc code=start
class Solution {
    int maxOr = 0;
    int cnt = 0;
    int[] nums;
    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        bt(0,0,0);
        bt0(0,0,0);
        return cnt;
    }

    void bt(int n, int length, int sum) {
        if (length == nums.length) return;
        for(int i = n; i < nums.length; i++) {
            maxOr = Math.max(maxOr, sum | nums[i]);
            bt(i + 1, length + 1, sum | nums[i]);
        }
    }

    void bt0(int n, int length, int sum) {
        if (length == nums.length) return;
        for(int i = n; i < nums.length; i++) {
            if ((sum | nums[i]) == maxOr) cnt++;
            bt0(i + 1, length + 1, sum | nums[i]);
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,2,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,1,5]\n
// [100000,100000,100000,100000,100000,100000]\n
// [1]\n
// [1,2]\n
// @lcpr case=end

 */

