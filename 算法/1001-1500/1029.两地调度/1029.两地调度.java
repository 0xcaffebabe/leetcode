/*
 * @lc app=leetcode.cn id=1029 lang=java
 * @lcpr version=
 *
 * [1029] 两地调度
 * 
 * 50/50 cases passed (1 ms)
 * Your runtime beats 99.32 % of java submissions
 * Your memory usage beats 45.05 % of java submissions (39.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int ans = 0;
        Arrays.sort(costs, (b,a) -> (a[1] - a[0]) - (b[1] - b[0]));
        // for(var i :costs)
            // System.out.print(Arrays.toString(i) + ",");
        // System.out.println();
        for(int i = 0; i < costs.length / 2; i++) 
            ans += costs[i][0];
        for(int i = costs.length / 2; i < costs.length; i++) 
            ans += costs[i][1];
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[10,20],[30,200],[400,50],[30,20]]\n
// @lcpr case=end

// @lcpr case=start
// [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]\n
// @lcpr case=end

// @lcpr case=start
// [[515,563],[451,713],[537,709],[343,819],[855,779],[457,60],[650,359],[631,42]]\n
// @lcpr case=end

 */

