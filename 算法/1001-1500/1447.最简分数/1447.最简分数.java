/*
 * @lc app=leetcode.cn id=1447 lang=java
 * @lcpr version=
 *
 * [1447] 最简分数
 * 
 * 100/100 cases passed (21 ms)
 * Your runtime beats 36 % of java submissions
 * Your memory usage beats 57 % of java submissions (44.6 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans = new ArrayList<>();
        for(int i = 2; i <= n; i++) ans.add("1/" + i);

        for(int i = 2; i < n; i++) {
            for(int j = i + 1; j <= n; j++) 
                if (gcd(j, i) == 1) ans.add(i + "/" + j);
            
        }
        return ans;
    }

    int gcd(int a, int b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
// @lc code=end



/*
// @lcpr case=start
// 2\n
// 10\n
// 100\n
// @lcpr case=end

// @lcpr case=start
// 3\n
// @lcpr case=end

// @lcpr case=start
// 4\n
// @lcpr case=end

// @lcpr case=start
// 1\n
// @lcpr case=end

 */

