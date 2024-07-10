/*
 * @lc app=leetcode.cn id=2840 lang=java
 * @lcpr version=
 *
 * [2840] 判断通过操作能否让字符串相等 II
 * 
 * 752/752 cases passed (8 ms)
 * Your runtime beats 23.53 % of java submissions
 * Your memory usage beats 67.65 % of java submissions (44.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] odd1 = new int[128];
        int[] odd2 = new int[128];
        int[] even1 = new int[128];
        int[] even2 = new int[128];
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (i % 2 == 0) even1[c]++;
            else odd1[c]++;
        }

        for(int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (i % 2 == 0) even2[c]++;
            else odd2[c]++;
        }

        for(int i = 0; i < 128; i++) {
            if (odd1[i] != odd2[i]) return false;
            if (even1[i] != even2[i]) return false;
        }

        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abcdba"\n"cabdab"\n
// "a"\n"a"\n
// "a"\n"b"\n
// "ab"\n"ab"\n
// "ab"\n"ba"\n
// @lcpr case=end

// @lcpr case=start
// "abe"\n"bea"\n
// @lcpr case=end

 */

