/*
 * @lc app=leetcode.cn id=2506 lang=java
 * @lcpr version=
 *
 * [2506] 统计相似字符串对的数目
 * 
 * 225/225 cases passed (52 ms)
 * Your runtime beats 25.14 % of java submissions
 * Your memory usage beats 36.31 % of java submissions (42.3 MB)
 */

// @lc code=start
class Solution {
    public int similarPairs(String[] words) {
        int ans = 0;
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if (comp(words[i], words[j])) ans++;
            }
        }
        return ans;
    }

    boolean comp(String a, String b) {
        boolean[] x = new boolean[26];
        boolean[] y = new boolean[26];
        for(var c: a.toCharArray())
            x[c - 'a'] = true;
        for(var c: b.toCharArray())
            y[c - 'a'] = true;
        for(int i = 0; i < 26; i++)
            if (x[i] != y[i])return false;
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["aba","aabb","abcd","bac","aabc"]\n
// ["aba","aabb","ab","bac","aabc"]\n
// @lcpr case=end

// @lcpr case=start
// ["aabb","ab","ba"]\n
// @lcpr case=end

// @lcpr case=start
// ["nba","cba","dba"]\n
// @lcpr case=end

 */

