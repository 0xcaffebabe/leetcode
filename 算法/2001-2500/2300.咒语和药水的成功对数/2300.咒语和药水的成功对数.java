/*
 * @lc app=leetcode.cn id=2300 lang=java
 * @lcpr version=
 *
 * [2300] 咒语和药水的成功对数
 * 
 * 56/56 cases passed (47 ms)
 * Your runtime beats 62.09 % of java submissions
 * Your memory usage beats 79.43 % of java submissions (55.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ans = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0; i < spells.length; i++) {
            int l = 0;
            int r = potions.length;
            while(l < r) {
                int mid = (l + r) / 2;

                if (1L * potions[mid] * spells[i] < success) l = mid + 1;
                else r = mid;
            }
            ans[i] = potions.length - l;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [5,1,3]\n[1,2,3,4,5]\n7\n
// [1,2,3,4,5,6,7]\n[1,2,3,4,5,6,7]\n25
// @lcpr case=end

// @lcpr case=start
// [3,1,2]\n[8,5,8]\n16\n
// [100000,1,2]\n[100000,5,8]\n10000000000\n
// @lcpr case=end

 */

