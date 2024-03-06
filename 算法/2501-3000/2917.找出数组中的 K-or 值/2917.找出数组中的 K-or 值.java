/*
 * @lc app=leetcode.cn id=2917 lang=java
 * @lcpr version=
 *
 * [2917] 找出数组中的 K-or 值
 * 
 * 951/951 cases passed (3 ms)
 * Your runtime beats 51.7 % of java submissions
 * Your memory usage beats 6.12 % of java submissions (43.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int findKOr(int[] nums, int k) {
        int[] m = new int[32];
        for(int i = 0; i < 32; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(((1 << i) & nums[j]) == (1 << i)) 
                    m[i]++;
            }
        }
        // System.out.println(Arrays.toString(m));
        int ans = 0;
        for(int i = 0; i < 32; i++) 
            if(m[i] >= k) ans += (1 << i);
        
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [7,12,9,8,9,15]\n4\n
// [2147483647,2147483647,2147483647,2147483647,2147483647,2147483647]\n1\n
// [2147483647,1]\n1\n
// [1,1]\n1\n
// @lcpr case=end

// @lcpr case=start
// [2,12,1,11,4,5]\n6\n
// @lcpr case=end

// @lcpr case=start
// [10,8,5,9,11,6,8]\n1\n
// @lcpr case=end

 */

