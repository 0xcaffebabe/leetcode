/*
 * @lc app=leetcode.cn id=3259 lang=java
 * @lcpr version=
 *
 * [3259] 超级饮料的最大强化能量
 * 
 * 563/563 cases passed (6 ms)
 * Your runtime beats 80 % of java submissions
 * Your memory usage beats 38.83 % of java submissions (61.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        long[] dpa = new long[energyDrinkA.length];
        long[] dpb = new long[energyDrinkB.length];
        dpa[0] = energyDrinkA[0];
        dpb[0] = energyDrinkB[0];
        
        for(int i = 1; i < dpa.length; i++) {
            dpa[i] = dpa[i - 1] + energyDrinkA[i];
            dpb[i] = dpb[i - 1] + energyDrinkB[i];
            if (i >= 2) {
                dpa[i] = Math.max(dpa[i], dpb[i - 2]  + energyDrinkA[i]);
                dpb[i] = Math.max(dpb[i], dpa[i - 2]  + energyDrinkB[i]);
            }
        }

        return Math.max(dpa[dpa.length - 1], dpb[dpb.length - 1]);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,1]\n[3,1,1]\n
// [1,2,3]\n[4,5,6]\n
// [4,3,5,3,4,5,6,6,5]\n[5,5,4,5,6,3,3,4,3]\n
// @lcpr case=end

// @lcpr case=start
// [4,1,1]\n[1,1,3]\n
// @lcpr case=end

 */

