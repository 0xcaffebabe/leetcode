/*
 * @lc app=leetcode.cn id=763 lang=java
 * @lcpr version=
 *
 * [763] 划分字母区间
 * 
 * 118/118 cases passed (6 ms)
 * Your runtime beats 30.78 % of java submissions
 * Your memory usage beats 32.46 % of java submissions (40.2 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> partitionLabels(String s) {
        int[][] m = new int[128][2];
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            m[c][0] = Math.min(m[c][0], i);
            m[c][1] = Math.max(m[c][1], i);
        }
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        int len = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            max = Math.max(max, m[c][1]);
            len++;
            if (i == max) {
                ans.add(len);
                len = 0;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "ababcbacadefegdehijhklij"\n
// @lcpr case=end

// @lcpr case=start
// "eccbbbbdec"\n
// "ab"\n
// "aa"\n
// "abcabc"\n
// "aaabbb"\n
// "aabb"\n
// "abb"\n
// "aab"\n
// @lcpr case=end

 */

