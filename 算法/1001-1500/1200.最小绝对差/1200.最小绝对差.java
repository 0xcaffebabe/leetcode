/*
 * @lc app=leetcode.cn id=1200 lang=java
 * @lcpr version=
 *
 * [1200] 最小绝对差
 * 
 * 38/38 cases passed (16 ms)
 * Your runtime beats 99.37 % of java submissions
 * Your memory usage beats 88.64 % of java submissions (54.2 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        int diff = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++) 
            diff = Math.min(arr[i] - arr[i - 1], diff);
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == diff)
                ans.add(Arrays.asList(arr[i - 1], arr[i]));
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [4,2,1,3]\n
// [40,11,26,27,-20]
// @lcpr case=end

// @lcpr case=start
// [1,3,6,10,15]\n
// @lcpr case=end

// @lcpr case=start
// [3,8,-10,23,19,-4,-14,27]\n
// @lcpr case=end

 */

