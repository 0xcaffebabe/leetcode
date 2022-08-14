import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1331 lang=java
 *
 * [1331] 数组序号转换
 * 
 * 38/38 cases passed (30 ms)
 * Your runtime beats 21.42 % of java submissions
 * Your memory usage beats 83.44 % of java submissions (57.2 MB)
 */

// @lc code=start
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = new int[arr.length];
        System.arraycopy(arr, 0, sorted, 0, arr.length);
        Arrays.sort(sorted);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < sorted.length; i++) map.putIfAbsent(sorted[i], map.size() + 1);

        for(int i = 0; i < arr.length; i++) arr[i] = map.get(arr[i]);
        return arr;
    }
}
// @lc code=end

