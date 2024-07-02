/*
 * @lc app=leetcode.cn id=3115 lang=java
 * @lcpr version=
 *
 * [3115] 质数的最大距离
 * 
 * 904/904 cases passed (4 ms)
 * Your runtime beats 53.25 % of java submissions
 * Your memory usage beats 22.05 % of java submissions (77.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start



class Solution {
    private static boolean[] prims = new boolean[101];
    static {
        var arr = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
        67, 71, 73, 79, 83, 89, 97};
        for(var i: arr) prims[i] = true;
    }
    public int maximumPrimeDifference(int[] nums) {
        int first = -1;
        int last = -1;
        for(int i = 0; i < nums.length; i++) {
            var v = nums[i];
            if (prims[v]) {
                if (first == -1) first = i;
                last = i;
            }
        }
        return last - first;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,9,5,3]\n
// [3]\n
// @lcpr case=end

// @lcpr case=start
// [4,8,2,8]\n
// @lcpr case=end

 */

