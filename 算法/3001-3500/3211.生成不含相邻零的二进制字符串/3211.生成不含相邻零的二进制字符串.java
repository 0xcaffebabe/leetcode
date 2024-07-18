/*
 * @lc app=leetcode.cn id=3211 lang=java
 * @lcpr version=
 *
 * [3211] 生成不含相邻零的二进制字符串
 * 
 * 执行用时分布 2ms 击败 89.04%
 * 消耗内存分布 44.98MB 击败 16.53%
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    int n;
    List<String> ans = new ArrayList<>();
    public List<String> validStrings(int n) {
        this.n = n;
        bt(new StringBuilder());
        return ans;
    }

    void bt(StringBuilder sb) {
        if (sb.length() == n) {
            ans.add(sb.toString());
            return;
        }
        if (sb.length() == 0) {
            sb.append('0');
            bt(sb);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            if (sb.charAt(sb.length() - 1) != '0') {
                sb.append('0');
                bt(sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        sb.append('1');
        bt(sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 3\n
// 2\n
// 4\n
// 5\n
// 6\n
// 7\n
// 8\n
// 9\n
// 10\n
// 11\n
// 12\n
// 13\n
// 14\n
// 15\n
// 16\n
// 17\n
// 18\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

