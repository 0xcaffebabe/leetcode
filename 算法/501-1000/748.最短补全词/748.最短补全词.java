import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=748 lang=java
 *
 * [748] 最短补全词
 * 
 * 102/102 cases passed (3 ms)
 * Your runtime beats 91.28 % of java submissions
 * Your memory usage beats 50 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        // Arrays.sort(words, (a, b) -> a.length() - b.length());
        char[] frq = new char[26];
        for(var c : licensePlate.toCharArray()) {
            if (c >= 'a' && c <= 'z') frq[c - 'a']++;
            if (c >= 'A' && c <= 'Z') frq[c - 'A']++;
        }
        int minLen = Integer.MAX_VALUE;
        String ans = words[0];
        for(var str : words) {
            boolean allContains = true;
            char[] map = new char[26];
            for(var c: str.toCharArray()) map[c - 'a']++;
            for(int i = 0; i < 26; i++) allContains &= map[i] >= frq[i];
            if (allContains && str.length() < minLen) {
                minLen = str.length();
                ans = str;
            }
        }
        return ans;
    }
}
// @lc code=end

