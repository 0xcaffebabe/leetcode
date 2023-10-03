/*
 * @lc app=leetcode.cn id=2586 lang=java
 * @lcpr version=
 *
 * [2586] 统计范围内的元音字符串数
 * 
 * 1053/1053 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 81.48 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans = 0;
        for(int i = left; i <= right; i++) {
            char c1 = words[i].charAt(0);
            char c2 = words[i].charAt(words[i].length() - 1);
            if ((c1 == 'a' || c1 == 'e' || c1 == 'i' ||  c1 == 'o' || c1 == 'u')
                && (c2 == 'a' || c2 == 'e' || c2 == 'i' ||  c2 == 'o' || c2 == 'u'))
                ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["are","amy","u"]\n0\n2\n
// @lcpr case=end

// @lcpr case=start
// ["hey","aeo","mu","ooo","artro"]\n1\n4\n
// @lcpr case=end

 */

