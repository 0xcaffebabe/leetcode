/*
 * @lc app=leetcode.cn id=2559 lang=java
 * @lcpr version=21908
 *
 * [2559] 统计范围内的元音字符串数
 * 
 * 93/93 cases passed (5 ms)
 * Your runtime beats 83.16 % of java submissions
 * Your memory usage beats 32.14 % of java submissions (82 MB)
 */

// @lc code=start
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] sums = new int[words.length];
        if (check(words[0].charAt(0)) && check(words[0].charAt(words[0].length() - 1))) sums[0] = 1;
        for(int i = 1; i < words.length; i++) {
            sums[i] = sums[i - 1];
            if (check(words[i].charAt(0)) && check(words[i].charAt(words[i].length() - 1))) sums[i] += 1;
        }

        int[] ans = new int[queries.length];
        for(int i = 0; i < ans.length; i++) {
            // System.out.println(queries[i][0]);
            // System.out.println(queries[i][1]);
            if (queries[i][0] == 0) ans[i] = sums[queries[i][1]];
            else ans[i] = sums[queries[i][1]] - sums[queries[i][0] - 1];
        }
        return ans;
    }

    boolean check(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["aba","bcb","ece","aa","e"]\n[[0,2],[1,4],[1,1]]\n
// ["aba","bcb","ece","aa","e"]\n[[0,2],[1,4],[0,0],[1,1],[4,4]]\n
// ["xxx","xxx","xxx","xxx","xxx"]\n[[0,2],[1,4],[0,0],[1,1],[4,4]]\n
// @lcpr case=end

// @lcpr case=start
// ["a","e","i"]\n[[0,2],[0,1],[2,2]]\n
// @lcpr case=end

 */

