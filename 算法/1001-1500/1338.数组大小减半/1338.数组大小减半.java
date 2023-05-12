/*
 * @lc app=leetcode.cn id=1338 lang=java
 * @lcpr version=21907
 *
 * [1338] 数组大小减半
 * 
 * 33/33 cases passed (16 ms)
 * Your runtime beats 87.5 % of java submissions
 * Your memory usage beats 25 % of java submissions (54.2 MB)
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minSetSize(int[] arr) {
        int[] map = new int[10_0001];
        for(var i : arr) map[i]++;
        Arrays.sort(map);
        int ans = 0;
        int n = 0;
        for(int i = map.length - 1; i >= 0; i--) {
            n += map[i];
            ans++;
            if (n >= arr.length / 2) return ans;
        }
        return -1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [3,3,3,3,5,5,5,2,2,7]\n
// @lcpr case=end

// @lcpr case=start
// [7,7,7,7,7,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4,5,6,7,9]\n
// @lcpr case=end

 */

