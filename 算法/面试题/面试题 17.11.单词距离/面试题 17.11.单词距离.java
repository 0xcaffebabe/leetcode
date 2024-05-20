/*
 * @lc app=leetcode.cn id=面试题 17.11 lang=java
 * @lcpr version=
 *
 * [面试题 17.11] 单词距离
 * 
 * 43/43 cases passed (22 ms)
 *  Your runtime beats 19.9 % of java submissions
 * Your memory usage beats 62.83 % of java submissions (56.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int findClosest(String[] words, String word1, String word2) {
        int p = 0;
        int q = 1;
        int ans = Integer.MAX_VALUE;
        while(true) {
            if (p == words.length || q == words.length) break;
            // System.out.println(p + "|" + q);
            if (words[p].equals(word1) && words[q].equals(word2)) {
                int dif = Math.abs(p - q);
                if (dif >= ans) {
                    if (p < q) p++;
                    else q++;
                }
                ans = Math.min(dif, ans);
            }else if (words[p].equals(word1)) {
                q++;
            }else if (words[q].equals(word2)) {
                p++;
            } else {
                p++;
                q++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["I","am","a","student","from","a","university","in","a","city"]\n"a"\n"student"\n
// ["a","a","a","a","a","b","b","b","b","b","b","b","a"]\n"a"\n"b"\n
// ["a","c","a","a","a","b","b","b","b","b","b","b","a"]\n"c"\n"b"\n
// ["a","c","a","a","a","b","b","b","b","b","b","b","a"]\n"b"\n"c"\n
// ["a","c","a","a","a","b","b","b","b","b","b","b","a"]\n"b"\n"a"\n
// @lcpr case=end

 */

