import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=697 lang=java
 *
 * [697] 数组的度
 * 
 * 89/89 cases passed (19 ms)
 * Your runtime beats 36.51 % of java submissions
 * Your memory usage beats 20.24 % of java submissions (46.4 MB)
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        // <数字, [出现次数, 第一次出现的位置, 最后一次出现的位置]>
        Map<Integer, int[]> map = new HashMap<>();
        int maxDegress = 0;
        for(int i = 0; i < nums.length; i++) {
            final int fi = i;
            map.computeIfAbsent(nums[i], k -> new int[]{1, fi, fi});
            var cn = map.get(nums[i]);
            cn[0]++;
            cn[2] = i;
            maxDegress = Math.max(maxDegress, cn[0]);
        }

        int ans = Integer.MAX_VALUE;
        for(var enr: map.entrySet()) {
            var cn = enr.getValue();
            if (cn[0] == maxDegress) ans = Math.min(ans, cn[2] - cn[1] + 1);
        }
        return ans;
    }
}
// @lc code=end

