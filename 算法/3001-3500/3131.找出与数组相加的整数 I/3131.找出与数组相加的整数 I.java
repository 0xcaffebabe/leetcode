/*
 * @lc app=leetcode.cn id=3131 lang=java
 * @lcpr version=
 *
 * [3131] 找出与数组相加的整数 I
 * 
 * 605/605 cases passed (1 ms)
 * Your runtime beats 67.2 % of java submissions
 * Your memory usage beats 84.53 % of java submissions (42 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,6,4]\n[9,7,5]\n
// @lcpr case=end

// @lcpr case=start
// [10]\n[5]\n
// [0]\n[0]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1]\n[1,1,1,1]\n
// @lcpr case=end

 */

