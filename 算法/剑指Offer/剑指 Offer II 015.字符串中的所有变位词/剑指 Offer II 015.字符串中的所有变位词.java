/*
 * @lc app=leetcode.cn id=剑指 Offer II 015 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 015] 字符串中的所有变位词
 * 
 * 60/60 cases passed (7 ms)
 * Your runtime beats 78.3 % of java submissions
 * Your memory usage beats 12.83 % of java submissions (42.9 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) return Collections.EMPTY_LIST;
        List<Integer> ans = new ArrayList<>();

        int[] cnt = new int[26];
        int[] cur = new int[26];
        int seg = p.length();

        for(char c : p.toCharArray()) cnt[c - 'a']++;
        for(int i = 0; i < seg; i++) cur[s.charAt(i) - 'a']++;
        
        if (Arrays.equals(cnt, cur)) ans.add(0);

        int limit = s.length() - seg;
        for(int i = 1; i <= limit; i++) {
            char c = s.charAt(i + seg - 1);
            char prev = s.charAt(i - 1);
            cur[prev - 'a']--;
            cur[c - 'a']++;
            // System.out.println(Arrays.toString(cur));
            if (Arrays.equals(cnt, cur)) ans.add(i);
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "cbaebabacd"\n"abc"\n
// @lcpr case=end

// @lcpr case=start
// "abab"\n"ab"\n
// @lcpr case=end

 */

