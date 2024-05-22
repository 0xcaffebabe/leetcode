/*
 * @lc app=leetcode.cn id=2225 lang=java
 * @lcpr version=
 *
 * [2225] 找出输掉零场或一场比赛的玩家
 * 
 * 127/127 cases passed (75 ms)
 * Your runtime beats 55.21 % of java submissions
 * Your memory usage beats 72.92 % of java submissions (87.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> loseMap = new HashMap<>();
        for(var i: matches) 
            loseMap.put(i[1], loseMap.getOrDefault(i[1], 0) + 1);
        Set<Integer> set = new HashSet<>();
        List<Integer> ans1 = new ArrayList<>();

        for(var i: matches) {
            if (!loseMap.containsKey(i[0])) 
                set.add(i[0]);
        }
        for(var enr: loseMap.entrySet()) {
            if (enr.getValue() == 1) ans1.add(enr.getKey());
        }
        List<Integer> ans0 = new ArrayList<>(set);
        ans0.sort(Integer::compare);
        ans1.sort(Integer::compare);
        return Arrays.asList(ans0, ans1);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]\n
// @lcpr case=end

// @lcpr case=start
// [[2,3],[1,3],[5,4],[6,4]]\n
// [[1,2]]\n
// @lcpr case=end

 */

