import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1817 lang=java
 *
 * [1817] 查找用户活跃分钟数
 * 
 * 38/38 cases passed (21 ms)
 * Your runtime beats 21.51 % of java submissions
 * Your memory usage beats 46.24 % of java submissions (51.1 MB)
 */

// @lc code=start
class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> userMinuteSet = new HashMap<>();
        for(var log : logs) {
            userMinuteSet.computeIfAbsent(log[0], key -> new HashSet<>());
            userMinuteSet.get(log[0]).add(log[1]);
        }
        List<Integer> countList = new ArrayList<>();
        for(var enr: userMinuteSet.entrySet()) 
            countList.add(enr.getValue().size());
        int[] ans = new int[k];
        countList.forEach(v -> ans[v - 1]++);
        return ans;
    }
}
// @lc code=end

