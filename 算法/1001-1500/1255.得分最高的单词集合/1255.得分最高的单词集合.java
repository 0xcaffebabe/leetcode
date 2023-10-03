/*
 * @lc app=leetcode.cn id=1255 lang=java
 * @lcpr version=
 *
 * [1255] 得分最高的单词集合
 * 
 * 52/52 cases passed (14 ms)
 * Your runtime beats 41.54 % of java submissions
 * Your memory usage beats 49.23 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    char[] letters;
    int[] letterCnt = new int[26];
    int[] score;
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        this.letters = letters;
        this.score = score;
        for(var c: letters) letterCnt[c - 'a']++;

        int max = 0;
        int n = words.length;
        for(int i = 0; i < 1 << n; i++) {
            int[] cnt = new int[26];
            for(int j = 0; j < n; j++) {
                if ((i >> j & 1) > 0) {
                    for(var c: words[j].toCharArray())
                        cnt[c - 'a']++;
                }
            }
            if (!matched(cnt)) continue;
            max = Math.max(max, score(cnt));
        }
        return max;
    }

    boolean matched(int[] cnt) {
        for(int i = 0; i < 26; i++)
            if (letterCnt[i] < cnt[i]) return false;
        return true;
    }

    int score(int[] cnt) {
        int ans = 0;
        for(int i = 0; i < cnt.length; i++)
            ans += cnt[i] * score[i];
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["dog","cat","dad","good"]\n["a","a","c","d","d","d","g","o","o"]\n[1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0]\n
// @lcpr case=end

// @lcpr case=start
// ["xxxz","ax","bx","cx"]\n["z","a","b","c","x","x","x"]\n[4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,0,10]\n
// @lcpr case=end

// @lcpr case=start
// ["leetcode"]\n["l","e","t","c","o","d"]\n[0,0,1,1,1,0,0,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0]\n
// @lcpr case=end

 */

