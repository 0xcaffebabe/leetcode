/*
 * @lc app=leetcode.cn id=2164 lang=java
 * @lcpr version=
 *
 * [2164] 对奇偶下标分别排序
 * 
 * 218/218 cases passed (6 ms)
 * Your runtime beats 15.54 % of java submissions
 * Your memory usage beats 34.46 % of java submissions (42.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        List<Integer> o = new ArrayList<>();
        List<Integer> e = new ArrayList<>();
        for(int i = 0; i < n; i++)
            if (i % 2 == 0) e.add(nums[i]);
            else o.add(nums[i]);
        o.sort((a,b) -> b - a);
        e.sort((a,b) -> a - b);
        int i = 0;
        int p = 0, q = 0;
        while(i < n) {
            if (i % 2 == 0) nums[i] = e.get(p++);
            else nums[i] = o.get(q++);
            i++;
        }
        return nums;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [2,1]\n
// [1,2,3,4,5,6]\n
// [1]\n
// @lcpr case=end

 */

