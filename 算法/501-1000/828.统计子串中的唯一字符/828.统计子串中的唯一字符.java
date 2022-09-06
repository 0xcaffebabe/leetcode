import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=828 lang=java
 *
 * [828] 统计子串中的唯一字符
 * 
 * 76/76 cases passed (44 ms)
 * Your runtime beats 49.29 % of java submissions
 * Your memory usage beats 32.86 % of java submissions (48.8 MB)
 */

// @lc code=start
class Solution {
    public int uniqueLetterString(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new ArrayList<>());
                map.get(c).add(-1);
            }
            map.get(c).add(i);
        }
        int ans = 0;
        for(var val: map.values()) {
            val.add(s.length());
            for(int i = 1; i < val.size() - 1; i++) {
                ans += (val.get(i) - val.get(i-1)) * (val.get(i+1)-val.get(i));
            }
        }
        return ans;
    }
}
// @lc code=end

