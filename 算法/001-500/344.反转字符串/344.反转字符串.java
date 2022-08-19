/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 * 
 * 477/477 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.06 % of java submissions (47.8 MB)
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        if (s.length <=1) return;
        int l=0,r=s.length-1;
        while(l<r){
            char tmp = s[l];
            s[l]=s[r];
            s[r]=tmp;
            l++;r--;
        }
    }
}
// @lc code=end

