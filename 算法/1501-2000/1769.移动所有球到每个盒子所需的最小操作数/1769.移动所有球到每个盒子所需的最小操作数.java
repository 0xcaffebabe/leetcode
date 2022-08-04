/*
 * @lc app=leetcode.cn id=1769 lang=java
 *
 * [1769] 移动所有球到每个盒子所需的最小操作数
 * 
 * 95/95 cases passed (3 ms)
 * Your runtime beats 81.31 % of java submissions
 * Your memory usage beats 58.82 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public int[] minOperations(String boxes) {
        // left[i]：把[0,i - 1]上的小球移动到位置i的成本
        int[] left = new int[boxes.length()];
        int[] right = new int[boxes.length()];
        int leftTotal = 0;
        int rightTotal = 0;
        left[0] = 0;
        right[boxes.length() - 1] = 0;
        for(int i = 1; i < boxes.length(); i++) {
            left[i] = left[i-1] + leftTotal;
            char c = boxes.charAt(i - 1);
            if (c == '1') {
                left[i]++;
                leftTotal++;
            }
        }
        for(int i = boxes.length() - 2; i >= 0; i--) {
            right[i] = right[i+1] + rightTotal;
            char c = boxes.charAt(i + 1);
            if (c == '1') {
                right[i]++;
                rightTotal++;
            }
        }
        int[] ans = new int[boxes.length()];
        for(int i = 0; i < ans.length; i++) ans[i] = left[i] + right[i];
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        return ans;
    }
}
// @lc code=end

