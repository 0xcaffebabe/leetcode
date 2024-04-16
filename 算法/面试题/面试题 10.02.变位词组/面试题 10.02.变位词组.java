/*
 * @lc app=leetcode.cn id=面试题 10.02 lang=java
 * @lcpr version=
 *
 * [面试题 10.02] 变位词组
 * 
 * 101/101 cases passed (5 ms)
 * Your runtime beats 99.38 % of java submissions
 * Your memory usage beats 57.41 % of java submissions (46.5 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] q = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97, 101};
        Map<Long, List<String>> map = new HashMap<>();
        for(var s: strs) {
            long n = 1;
            for(var c: s.toCharArray()) n *= q[c-97];
            map.computeIfAbsent(n, k -> new ArrayList<>())
                .add(s);
        }
        return new ArrayList<>(map.values());
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["eat", "tea", "tan", "ate", "nat", "bat"]\n
// ["abcdefghijklmnopqrstuvwxyz", "stuvwxyzabcdefghijklmnopqr", "tan", "ate", "nat", "bat"]\n
// @lcpr case=end

 */

