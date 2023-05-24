/*
 * @lc app=leetcode.cn id=剑指 Offer II 006 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 006] 排序数组中两个数字之和
 * 
 * 19/19 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.05 % of java submissions (43.8 MB)
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p = 0;
        int q =  numbers.length - 1;
        while(p < q) {
            int sum = numbers[p] + numbers[q];
            if (target == sum) return new int[]{p, q};
            if (sum < target) p++;
            else q--;
        }
        return new int[]{-1,-1};
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,4,6,10]\n8\n
// @lcpr case=end

// @lcpr case=start
// [2,3,4]\n6\n
// @lcpr case=end

// @lcpr case=start
// [-1,0]\n-1\n
// @lcpr case=end

 */

