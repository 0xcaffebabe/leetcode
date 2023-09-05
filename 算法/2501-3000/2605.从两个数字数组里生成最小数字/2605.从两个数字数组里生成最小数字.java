/*
 * @lc app=leetcode.cn id=2605 lang=java
 * @lcpr version=
 *
 * [2605] 从两个数字数组里生成最小数字
 * 
 * 388/388 cases passed (1 ms)
 * Your runtime beats 65.22 % of java submissions
 * Your memory usage beats 62.61 % of java submissions (39.4 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        boolean[] h = new boolean[10];
        for(var i : nums1) h[i] = true;
        for(var i : nums2) 
            if (h[i]) return i;
        boolean first = true;
        if (nums1[0] > nums2[0]) first = false;
        return (first ? nums1[0]: nums2[0]) * 10 + 
            (first ? nums2[0]: nums1[0]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,3]\n[5,7]\n
// [1]\n[2]\n
// [1]\n[1]\n
// [9]\n[9]\n
// [9]\n[1]\n
// @lcpr case=end

// @lcpr case=start
// [3,5,2,6]\n[3,1,7]\n
// @lcpr case=end

 */

