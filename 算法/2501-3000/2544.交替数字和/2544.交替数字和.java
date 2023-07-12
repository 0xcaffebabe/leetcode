/*
 * @lc app=leetcode.cn id=2544 lang=java
 * @lcpr version=21909
 *
 * [2544] 交替数字和
 * 
 * 118/118 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 60.2 % of java submissions (38.2 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int alternateDigitSum(int n) {
        List<Integer> list = new ArrayList<>();
        while(n != 0) {
            list.add(n % 10);
            n /= 10;
        }
        int f = 1;
        int ans = 0;
        // System.out.println(list);
        for(int i = list.size() - 1; i >= 0; i--) {
            ans += list.get(i) * f;
            f = -f;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 521\n
// 99999999\n
// 100000000\n
// @lcpr case=end

// @lcpr case=start
// 111\n
// @lcpr case=end

// @lcpr case=start
// 886996\n
// @lcpr case=end

 */

