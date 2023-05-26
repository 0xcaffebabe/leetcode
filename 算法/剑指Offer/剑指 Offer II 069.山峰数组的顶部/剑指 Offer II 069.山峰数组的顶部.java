/*
 * @lc app=leetcode.cn id=剑指 Offer II 069 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 069] 山峰数组的顶部
 * 
 * 34/34 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 15.94 % of java submissions (42.1 MB)
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if (arr[i] > arr[max]) max = i;
        }
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [0,1,0]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,4,2]\n
// @lcpr case=end

// @lcpr case=start
// [0,10,5,2]\n
// @lcpr case=end

// @lcpr case=start
// [3,4,5,1]\n
// @lcpr case=end

// @lcpr case=start
// [24,69,100,99,79,78,67,36,26,19]\n
// @lcpr case=end

 */

