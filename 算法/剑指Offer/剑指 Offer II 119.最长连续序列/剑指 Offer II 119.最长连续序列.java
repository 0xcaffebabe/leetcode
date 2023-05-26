/*
 * @lc app=leetcode.cn id=剑指 Offer II 119 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 119] 最长连续序列
 * 
 * 70/70 cases passed (270 ms)
 * Your runtime beats 9.44 % of java submissions
 * Your memory usage beats 68.53 % of java submissions (53.1 MB)
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



/*
// @lcpr case=start
// [100,4,200,1,3,2]\n
// @lcpr case=end

// @lcpr case=start
// [0,3,7,2,5,8,4,6,0,1]\n
// @lcpr case=end

 */

