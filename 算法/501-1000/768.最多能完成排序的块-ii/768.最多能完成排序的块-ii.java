import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=768 lang=java
 *
 * [768] 最多能完成排序的块 II
 * 
 * 139/139 cases passed (7 ms)
 * Your runtime beats 37.73 % of java submissions
 * Your memory usage beats 12.45 % of java submissions (41.7 MB)
 */

// @lc code=start
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int[] sorted = new int[arr.length];
        System.arraycopy(arr, 0, sorted, 0, arr.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> counter = new HashMap<>();
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int y = sorted[i];
            counter.put(x, counter.getOrDefault(x, 0) + 1);
            if (counter.get(x) == 0) counter.remove(x);

            counter.put(y, counter.getOrDefault(y, 0) - 1);
            if (counter.get(y) == 0) counter.remove(y);

            if (counter.isEmpty()) ans++;
        }
        return ans;
    }
}
// @lc code=end

