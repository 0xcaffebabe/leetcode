import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=821 lang=java
 *
 * [821] 字符的最短距离
 * 
 * 76/76 cases passed (3 ms)
 * Your runtime beats 31.07 % of java submissions
 * Your memory usage beats 17.46 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        List<Integer> poss = new ArrayList<>();
        for(int i = 0; i < s.length(); i++)  if (s.charAt(i) == c) poss.add(i);
        
        int k = 0;
        for(int i = 0; i < s.length(); i++) {
            if (k < poss.size() - 1) {
                ans[i] = Math.min(Math.abs(i - poss.get(k)), Math.abs(i - poss.get(k + 1)));
                if (poss.get(k + 1) == i) k++;
            }else{
                ans[i] = Math.abs(i - poss.get(k));
            }
        }
        return ans;
    }
}
// @lc code=end

