/*
 * @lc app=leetcode.cn id=1493 lang=java
 * @lcpr version=
 *
 * [1493] 删掉一个元素以后全为 1 的最长子数组
 * 
 * 82/82 cases passed (2 ms)
 * Your runtime beats 88.27 % of java submissions
 * Your memory usage beats 38.98 % of java submissions (55.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int max = 0;
        int count = 0; // 当前窗口0的数量
        int p = 0;
        int q = 0;
        while(q < n) {
            if (nums[q] == 0)  count++;
            while(count > 1) {
                if (nums[p] == 0) count--;
                p++;
            }
            max = Math.max(max, q - p);
            q++;
        }
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,0,1]\n
// [1]\n
// [0]\n
// [1,1]\n
// [0,0]\n
// [0,1]\n
// [1,0]\n
// [1,0,1]\n
// [0,1,0]\n
// [1,1,0]\n
// [0,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [0,1,1,1,0,1,1,0,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1]\n
// @lcpr case=end

 */

