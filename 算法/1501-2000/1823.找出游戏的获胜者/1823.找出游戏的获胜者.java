/*
 * @lc app=leetcode.cn id=1823 lang=java
 * @lcpr version=
 *
 * [1823] 找出游戏的获胜者
 * 
 * 95/95 cases passed (2 ms)
 * Your runtime beats 53.15 % of java submissions
 * Your memory usage beats 21.02 % of java submissions (38.7 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) list.add(i);
        int p = 0;
        while(n > 1) {
            p = (p + k - 1) % n;
            list.remove(p);
            n--;
        }
        return list.get(0);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 5\n2\n
// @lcpr case=end

// @lcpr case=start
// 6\n5\n
// 6\n1\n
// 6\n2\n
// 500\n499\n
// 500\n250\n
// @lcpr case=end

 */

