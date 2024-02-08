/*
 * @lc app=leetcode.cn id=2062 lang=java
 * @lcpr version=
 *
 * [2062] 统计字符串中的元音子字符串
 * 
 * 88/88 cases passed (61 ms)
 * Your runtime beats 8.7 % of java submissions
 * Your memory usage beats 75.36 % of java submissions (40.4 MB)
 */

// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countVowelSubstrings(String word) {
        int ans = 0;
        for(int i = 0; i <= word.length() - 5; i++) {
            for(int j = i + 5; j <= word.length(); j++) {
                boolean A = false;
                boolean E = false;
                boolean I = false;
                boolean O = false;
                boolean U = false;
                boolean other = false;
                // System.out.println(word.substring(i, j));
                for(int k = i; k < j; k++) {
                    if (word.charAt(k) == 'a') A = true;
                    else if (word.charAt(k) == 'e') E = true;
                    else if (word.charAt(k) == 'i') I = true;
                    else if (word.charAt(k) == 'o') O = true;
                    else if (word.charAt(k) == 'u') U = true;
                    else other = true;
                }
                if (A && E && I && O && U && !other) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end
/*
// @lcpr case=start
// "aeiouu"\n
// "unicornarihan"\n
// "cuaieuouac"\n
// "bbaeixoubb"\n
// "aeiou"\n
// "a"\n
// "aei"\n
// "bbb"\n
// @lcpr case=end


 */
