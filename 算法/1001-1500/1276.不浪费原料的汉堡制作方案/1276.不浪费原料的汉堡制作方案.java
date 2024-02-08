/*
 * @lc app=leetcode.cn id=1276 lang=java
 * @lcpr version=
 *
 * [1276] 不浪费原料的汉堡制作方案
 * 
 * 1008/1008 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 5.13 % of java submissions (41.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        // 4x + 2y = tomato
        // x + y = cheese
        int x = (tomatoSlices - (2 * cheeseSlices)) / 2;
        int y = cheeseSlices - x;
        if ((tomatoSlices - (2 * cheeseSlices)) % 2 != 0) return new ArrayList<>();
        
        if (x >= 0 && y >= 0)  return Arrays.asList(x, y);
        return new ArrayList<>();
    }
}
// @lc code=end



/*
// @lcpr case=start
// 16\n7\n
// @lcpr case=end

// @lcpr case=start
// 17\n4\n
// @lcpr case=end

// @lcpr case=start
// 4\n17\n
// @lcpr case=end

// @lcpr case=start
// 0\n0\n
// @lcpr case=end

// @lcpr case=start
// 2\n1\n
// @lcpr case=end

 */

