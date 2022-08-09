/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 * 
 * 550/550 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 85.86 % of java submissions (39.6 MB)
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
       var arr = word.toCharArray();
       boolean allUpper = true;
       for(var c : arr) allUpper &= c <= 95;
       if (allUpper) return true;
       boolean allLower = true;
       for(var c : arr) allLower &= c >= 97;
       if (allLower) return true;
       boolean firstUpperOtherLower = arr[0] <= 95;
       for(int i = 1; i < arr.length; i++) firstUpperOtherLower &= arr[i] >= 97;
       return firstUpperOtherLower;

    }
}
// @lc code=end

