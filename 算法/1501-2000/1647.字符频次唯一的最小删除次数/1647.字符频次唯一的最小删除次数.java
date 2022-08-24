import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1647 lang=java
 *
 * [1647] 字符频次唯一的最小删除次数
 * 
 * 103/103 cases passed (6 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 93.05 % of java submissions (41.8 MB)
 */

// @lc code=start
class Solution {
    public int minDeletions(String s) {
        int[] frq = new int[26];
        for(var c :s.toCharArray()) frq[c - 'a']++;

        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(var i : frq) {
            if (i == 0) continue;
            while (set.contains(i)) {
                i--;
                ans++;
            }
            if (i != 0) set.add(i);
        }
        return ans;
    }
}
// @lc code=end

