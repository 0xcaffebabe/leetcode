/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 * 
 * 206/206 cases passed (32 ms)
 * Your runtime beats 82.01 % of java submissions
 * Your memory usage beats 78.73 % of java submissions (43.6 MB)
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(var i : candyType) set.add(i);
        return Math.min(candyType.length / 2, set.size());
    }
}
// @lc code=end

