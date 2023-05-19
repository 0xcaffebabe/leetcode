/*
 * @lc app=leetcode.cn id=1079 lang=java
 * @lcpr version=21907
 *
 * [1079] 活字印刷
 * 
 * 86/86 cases passed (25 ms)
 * Your runtime beats 19.28 % of java submissions
 * Your memory usage beats 14.35 % of java submissions (43.5 MB)
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<String> set = new HashSet<>();
    char[] arr;
    boolean[] visted;
    public int numTilePossibilities(String tiles) {
        visted = new boolean[tiles.length()];
        arr = tiles.toCharArray();
        bt(new StringBuilder());
        return set.size();
    }

    void bt(StringBuilder sb) {
        // System.out.println(sb);
        if (sb.length() > 0 && sb.length() <= arr.length) set.add(sb.toString());
        for(int i = 0; i < arr.length; i++) {
            if (visted[i]) continue;
            sb.append(arr[i]);
            visted[i] = true;
            bt(new StringBuilder(sb));
            sb.deleteCharAt(sb.length() - 1);
            visted[i] = false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// "AAB"\n
// @lcpr case=end

// @lcpr case=start
// "AAABBC"\n
// @lcpr case=end

// @lcpr case=start
// "V"\n
// @lcpr case=end

// @lcpr case=start
// "TMNBOEN"\n
// @lcpr case=end

 */

