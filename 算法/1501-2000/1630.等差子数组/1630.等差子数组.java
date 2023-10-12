/*
 * @lc app=leetcode.cn id=1630 lang=java
 * @lcpr version=
 *
 * [1630] 等差子数组
 * 
 * 102/102 cases passed (18 ms)
 * Your runtime beats 41.51 % of java submissions
 * Your memory usage beats 21.7 % of java submissions (43.4 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    int[] nums;
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        this.nums = nums;
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++) 
            ans.add(check(l[i], r[i]));
        return ans;
    }

    boolean check(int l, int r) {
        int[] a = new int[r - l + 1];
        for(int i = l; i <= r; i++) 
            a[i - l] = nums[i];
        if (a.length <= 1) return true;
        Arrays.sort(a);
        // System.out.println(Arrays.toString(a));
        int diff = Math.abs(a[0] - a[1]);
        for(int i = 0; i < a.length - 1; i++) 
            if (a[i + 1] - a[i] != diff) return false;
        return true;

    }
}
// @lc code=end


/*
// @lcpr case=start
// [4,6,5,9,3,7]\n[0,0,2]\n[2,3,5]\n
// [4,6,5,9,3,7]\n[0,0,2]\n[1,3,5]\n
// @lcpr case=end

// @lcpr case=start
// [-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10]\n[0,1,6,4,8,7]\n[4,4,9,7,9,10]\n
// @lcpr case=end

 */

