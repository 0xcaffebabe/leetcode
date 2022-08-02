/*
 * @lc app=leetcode.cn id=2160 lang=java
 *
 * [2160] 拆分数位后四位数字的最小和
 * 
 * 99/99 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 44.52 % of java submissions (38.4 MB)
 */

// @lc code=start
class Solution {
    public int minimumSum(int num) {
        int a = num / 1000;
        int b = (num % 1000) / 100;
        int c = (num % 100) / 10;
        int d = num % 10;
        int[] arr = {a,b,c,d};
        Arrays.sort(arr);
        return cv(arr[0], arr[2]) + cv(arr[1], arr[3]);
    }

    private int cv(int...nums) {
        int p = 0;
        for(int i = 0; i < nums.length; i++) p = p * 10 + nums[i];
        return p;
    }
}
// @lc code=end

