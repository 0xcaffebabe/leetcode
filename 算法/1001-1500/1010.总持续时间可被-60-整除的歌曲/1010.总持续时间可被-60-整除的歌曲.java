/*
 * @lc app=leetcode.cn id=1010 lang=java
 * @lcpr version=21909
 *
 * [1010] 总持续时间可被 60 整除的歌曲
 * 
 * 35/35 cases passed (2 ms)
 * Your runtime beats 64.17 % of java submissions
 * Your memory usage beats 63.46 % of java submissions (51.8 MB)
 */

// @lc code=start
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] map = new int[60];
        int ans = 0;
        for(var i : time) {
            var t = i % 60;
            if (t == 0) ans += map[0];
            else ans += map[60 - t];
            map[t]++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [30,20,150,100,40]\n
// @lcpr case=end

// @lcpr case=start
// [60,60,60]\n
// @lcpr case=end

 */

