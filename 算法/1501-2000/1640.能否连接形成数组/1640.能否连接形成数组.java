import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1640 lang=java
 *
 * [1640] 能否连接形成数组
 * 
 * 84/84 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 71.63 % of java submissions (40.7 MB)
 */

// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        // 记录每个数字的位置
        int[] map = new int[101];
        Arrays.fill(map, -1);
        for(int i = 0; i < arr.length; i++) map[arr[i]] = i;
        // 如果发现pieces不存在该数字 或者 arr中两个数字之间位置差不是1
        // 那就是无法连接
        for(var item : pieces) {
            if (item.length == 1 && map[item[0]] == -1) return false;

            for(int i = 1; i < item.length; i++) 
                if (map[item[i]] - map[item[i-1]] != 1) return false;
        }
        return true;
    }
}
// @lc code=end

