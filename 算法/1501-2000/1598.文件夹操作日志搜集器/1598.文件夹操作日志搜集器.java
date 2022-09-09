/*
 * @lc app=leetcode.cn id=1598 lang=java
 *
 * [1598] 文件夹操作日志搜集器
 * 
 * 99/99 cases passed (1 ms)
 * Your runtime beats 99.68 % of java submissions
 * Your memory usage beats 51.59 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for(var i :logs) {
            if ("./".equals(i)) continue;
            if ("../".equals(i) ) {
                if (depth > 0) depth--;
            } else depth++;
        }
        return depth;
    }
}
// @lc code=end

