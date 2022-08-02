/*
 * @lc app=leetcode.cn id=1689 lang=java
 *
 * [1689] 十-二进制数的最少数目
 * 
 * 97/97 cases passed (3 ms)
 * Your runtime beats 97.35 % of java submissions
 * Your memory usage beats 80.85 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(var i : n.toCharArray()) {
            if (i == '9') return 9;
            if (max < i - '0') max = i - '0';
        }
        return max;
    }
}
// @lc code=end

