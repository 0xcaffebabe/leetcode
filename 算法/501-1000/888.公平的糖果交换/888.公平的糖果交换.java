/*
 * @lc app=leetcode.cn id=888 lang=java
 * @lcpr version=21907
 *
 * [888] 公平的糖果交换
 * 
 * 75/75 cases passed (8 ms)
 * Your runtime beats 95.28 % of java submissions
 * Your memory usage beats 9.44 % of java submissions (43.9 MB)
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int s1 = 0;
        int s2 = 0;
        Set<Integer> set = new HashSet<>();
        
        for(var i : aliceSizes) s1 += i;
        for(var i : bobSizes) {
            s2 += i;
            set.add(i);
        }
        int diff = s1 -s2;
        for(var a : aliceSizes) {
            int b = a - diff / 2;
            if (set.contains(b)) return new int[]{a,b};
        }
        return new int[]{0,0};

    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1]\n[2,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n[2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2]\n[1,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,5]\n[2,4]\n
// @lcpr case=end

 */

