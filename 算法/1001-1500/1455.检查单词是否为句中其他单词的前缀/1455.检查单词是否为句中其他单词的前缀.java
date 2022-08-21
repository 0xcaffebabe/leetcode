/*
 * @lc app=leetcode.cn id=1455 lang=java
 *
 * [1455] 检查单词是否为句中其他单词的前缀
 * 
 * 40/40 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 23.45 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        var arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= searchWord.length()) {
                boolean matched = true;
                int p = 0;
                int q = 0;
                while(q < searchWord.length()) {
                    if (arr[i].charAt(p++) != searchWord.charAt(q++)) {
                        matched = false;
                        break;
                    }
                }
                if (matched) return i + 1;
            }
        }
        return -1;
    }
}
// @lc code=end

