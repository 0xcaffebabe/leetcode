/*
 * @lc app=leetcode.cn id=1414 lang=java
 * @lcpr version=
 *
 * [1414] 和为 K 的最少斐波那契数字数目
 * 
 * 504/504 cases passed (1 ms)
 * Your runtime beats 85 % of java submissions
 * Your memory usage beats 98.33 % of java submissions (39.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<Integer> f = new ArrayList<>();
    static {
        f.add(1);
        f.add(1);
        while(f.get(f.size() - 1) < 1000000000) 
            f.add(f.get(f.size() - 1) + f.get(f.size() - 2));
    }
    public int findMinFibonacciNumbers(int k) {
        
        
        int ans = 0;
        int i = f.size() - 1;
        while(k > 0) {
            if (k == 0) break;
            if (f.get(i) > k) {
                i--;
                continue;
            }
            k -= f.get(i);
            ans++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 7\n
// 39088169\n
// 9\n
// 1000000000\n
// @lcpr case=end

// @lcpr case=start
// 10\n
// @lcpr case=end

// @lcpr case=start
// 19\n
// @lcpr case=end

 */

