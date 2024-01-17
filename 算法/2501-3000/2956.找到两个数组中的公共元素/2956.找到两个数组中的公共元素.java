/*
 * @lc app=leetcode.cn id=2956 lang=java
 * @lcpr version=
 *
 * [2956] 找到两个数组中的公共元素
 * 
 * 1207/1207 cases passed (2 ms)
 * Your runtime beats 91.59 % of java submissions
 * Your memory usage beats 12.55 % of java submissions (44.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] m1 = new boolean[101];
        boolean[] m2 = new boolean[101];
        for(var i: nums1) m1[i] = true;
        for(var i: nums2) m2[i] = true;
        int a = 0;
        int b = 0;
        for(int i = 0; i < nums1.length; i++)
            if (m2[nums1[i]]) a++;
        for(int i = 0; i < nums2.length; i++)
            if (m1[nums2[i]]) b++;
        return new int[]{a,b};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,3,2,3,1]\n[2,2,5,2,3,6]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,2,3]\n[1,5]\n
// [24,28,7,27,7,27,9,24,9,10]\n[12,29,9,7,5]\n
// @lcpr case=end

 */

