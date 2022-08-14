/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 * 
 * 21/21 cases passed (1 ms)
 * Your runtime beats 99 % of java submissions
 * Your memory usage beats 11.82 % of java submissions (44.5 MB)
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p = 0;
        int q =  numbers.length - 1;
        while(p < q) {
            int sum = numbers[p] + numbers[q];
            if (target == sum) return new int[]{p + 1, q + 1};
            if (sum < target) p++;
            else q--;
        }
        return new int[]{-1,-1};

    }
}
// @lc code=end

