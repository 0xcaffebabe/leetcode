/*
 * @lc app=leetcode.cn id=318 lang=java
 * @lcpr version=
 *
 * [318] 最大单词长度乘积
 * 
 * 168/168 cases passed (8 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 20.44 % of java submissions (44.2 MB)
 */

// @lc code=start
class Solution {
    public int maxProduct(String[] words) {
        int[] vals = new int[words.length];
        for(int i = 0; i < words.length; i++)
            vals[i] = toi(words[i]);
        int ans = 0;
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i; j < words.length; j++) 
                if ((vals[i] & vals[j]) == 0) 
                    ans = Math.max(ans, words[i].length() * words[j].length());
        }
        return ans;
    }

    int toi(String s) {
        int ans = 0;
        for(var c : s.toCharArray()) {
            int i = c - 'a';
            ans |= 1 << i;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abcw","baz","foo","bar","xtfn","abcdef"]\n
// @lcpr case=end

// @lcpr case=start
// ["a","ab","abc","d","cd","bcd","abcd"]\n
// @lcpr case=end

// @lcpr case=start
// ["a","aa","aaa","aaaa"]\n
// ["a","b"]\n
// @lcpr case=end

 */

