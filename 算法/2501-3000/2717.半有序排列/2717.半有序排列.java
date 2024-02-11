/*
 * @lc app=leetcode.cn id=2717 lang=java
 * @lcpr version=
 *
 * [2717] 半有序排列
 * 
 * 1977/1977 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 10.85 % of java submissions (43.4 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int max = 0;
        int min = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) min = i;
            if (nums[i] == nums.length) max = i;
        }
        if (max > min) return nums.length - max + min - 1;
        return nums.length - max + min - 2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,1,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,4,1,3]\n
// [1,2,3]\n
// [3,2,1]\n
// [2,1,3]\n
// [1,2,3,4]\n
// [4,3,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,4,2,5]\n
// [1,2]\n
// [2,1]\n
// @lcpr case=end

 */

