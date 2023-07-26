/*
 * @lc app=leetcode.cn id=1742 lang=java
 * @lcpr version=21912
 *
 * [1742] 盒子中小球的最大数量
 * 
 * 97/97 cases passed (13 ms)
 * Your runtime beats 92.9 % of java submissions
 * Your memory usage beats 97.42 % of java submissions (38 MB)
 */

// @lc code=start
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] m = new int[50];
        for(int i = lowLimit; i <= highLimit; i++) {
            int n = i;
            int s = 0;
            while(n > 0) {
                s += n % 10;
                n /= 10;
            }
            // System.out.println(s);
            m[s] ++;
        }
        int ans = 0;
        for(var i : m) ans = Math.max(ans, i);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1\n10\n
// 1\n1\n
// @lcpr case=end

// @lcpr case=start
// 5\n15\n
// 1\n100000\n
// @lcpr case=end

// @lcpr case=start
// 19\n28\n
// @lcpr case=end

 */

