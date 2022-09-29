import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1002 lang=java
 *
 * [1002] 查找共用字符
 * 
 * 83/83 cases passed (3 ms)
 * Your runtime beats 83.54 % of java submissions
 * Your memory usage beats 54.9 % of java submissions (41.5 MB)
 */

// @lc code=start
class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFrq = new int[26];
        Arrays.fill(minFrq, Integer.MAX_VALUE);
        int[] frq = new int[26];
        
        for(int i = 0; i < words.length; i++) {
            Arrays.fill(frq, 0);
            for(var c: words[i].toCharArray()) frq[c - 'a']++;
            for(int j = 0; j < 26; j++) minFrq[j] = Math.min(minFrq[j], frq[j]);
        }
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < minFrq[i]; j++) 
                ans.add(((char)(i + 'a')) + "");
        }
        return ans;
    }
}
// @lc code=end

