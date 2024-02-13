/*
 * @lc app=leetcode.cn id=2186 lang=java
 * @lcpr version=
 *
 * [2186] 制造字母异位词的最小步骤数 II
 * 
 * 70/70 cases passed (11 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 43.9 % of java submissions (46.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minSteps(String s, String t) {
        int[] m1 = new int[128];
        int[] m2 = new int[128];
        for(var c: s.toCharArray()) m1[c]++;
        for(var c: t.toCharArray()) m2[c]++;
        int ans = 0;
        for(int i = 0; i < 128; i++){
            if(m1[i] != m2[i]) ans += Math.abs(m1[i] - m2[i]);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leetcode"\n"coats"\n
// @lcpr case=end

// @lcpr case=start
// "night"\n"thing"\n
// "kafka"\n"java"\n
// "a"\n"b"\n
// "b"\n"b"\n
// @lcpr case=end

 */

