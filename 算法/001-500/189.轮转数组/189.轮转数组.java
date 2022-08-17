/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 * 
 * 38/38 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 50.66 % of java submissions (57 MB)
 */

// @lc code=start
class Solution {
    int[] nums;
    public void rotate(int[] nums, int k) {
        // 避免k比数组大
        k %= nums.length;
        this.nums = nums;
        // 全部反转
        reverse(0, nums.length - 1);
        // 再反转前面的k个元素 这样后面的k个元素就跑到前面二零
        reverse(0, k - 1);
        // 再反转k到数组结尾 保持原来的顺序
        reverse(k, nums.length - 1);
    }
    void reverse(int start, int end) {
        while(start < end) {
            int c = nums[start];
            nums[start] = nums[end];
            nums[end] = c;
            start++;
            end--;
        }
    }
}
// @lc code=end

