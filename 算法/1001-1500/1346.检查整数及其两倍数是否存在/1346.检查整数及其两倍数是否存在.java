import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1346 lang=java
 *
 * [1346] 检查整数及其两倍数是否存在
 * 
 * 107/107 cases passed (3 ms)
 * Your runtime beats 30.51 % of java submissions
 * Your memory usage beats 28.86 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) map.put(arr[i], i);
        for(int i = 0; i < arr.length; i++) if (map.containsKey(arr[i] * 2) && i != map.get(arr[i] * 2)) return true;
        return false;
    }
}
// @lc code=end

