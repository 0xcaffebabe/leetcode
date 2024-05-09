/*
 * @lc app=leetcode.cn id=2105 lang=java
 * @lcpr version=
 *
 * [2105] 给植物浇水 II
 * 
 * 57/57 cases passed (4 ms)
 * Your runtime beats 71.43 % of java submissions
 * Your memory usage beats 50 % of java submissions (56.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minimumRefill(int[] plants, int capacityA , int capacityB) {
        int a = capacityA;
        int b = capacityB;
        int ans = 0;
        int p = 0, q = plants.length - 1;
        while(p <= q) {
            if (p == q) {
                if (a >= b) {
                    if (a < plants[p]) ans++;
                } else {
                    if (b < plants[q]) ans++;
                }
            } else {
                if (a < plants[p]) {
                    ans++;
                    a = capacityA;
                }
                a -= plants[p];
                if (b < plants[q]) {
                    ans++;
                    b = capacityB;
                }
                b -= plants[q];
            }
            p++;
            q--;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,2,3,3]\n5\n5\n
// [1]\n1\n1\n
// [2]\n2\n2\n
// [1,2,4,4,5]\n6\n5
// @lcpr case=end

// @lcpr case=start
// [2,2,3,3]\n3\n4\n
// @lcpr case=end

// @lcpr case=start
// [5]\n10\n8\n
// @lcpr case=end

 */

