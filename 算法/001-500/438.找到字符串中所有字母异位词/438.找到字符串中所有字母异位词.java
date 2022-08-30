import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 * 
 * 61/61 cases passed (8 ms)
 * Your runtime beats 67.18 % of java submissions
 * Your memory usage beats 34.33 % of java submissions (42.7 MB)
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

