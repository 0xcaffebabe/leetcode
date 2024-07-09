/*
 * @lc app=leetcode.cn id=面试题 10.11 lang=java
 * @lcpr version=
 *
 * [面试题 10.11] 峰与谷
 * 
 * 126/126 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 76.19 % of java submissions (44.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start


class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if (i % 2 == 0) {
                if (nums[i] < nums[i - 1]) swap(nums, i, i - 1);
            } else {
                if (nums[i] > nums[i - 1]) swap(nums, i, i - 1);
            }      
        }
    }

    void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5, 3, 1, 2, 3]\n
// []\n
// [3,5,2,1,6,4]\n
// [1]\n
// @lcpr case=end

 */

