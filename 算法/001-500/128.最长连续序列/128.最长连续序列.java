import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 * 
 * 72/72 cases passed (267 ms)
 * Your runtime beats 13.37 % of java submissions
 * Your memory usage beats 75.81 % of java submissions (57.6 MB)
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var i : nums) set.add(i);

        int max = 0;
        int cur = 1;
        int curNum = 0;
        for(var i : nums) {
            curNum = i;
            cur = 1;
            // 代表从这个数开始起头
            if (!set.contains(curNum - 1)) {
                // 如果这个数的下一个数存在
                // 这个子序列就一直加到这个数的下一个数不存在
                while(set.contains(curNum + 1)) {
                    curNum++;
                    cur++;
                }
                max = Math.max(cur, max);
            }
        }
        return max;
    }
}
// @lc code=end

