/*
 * @lc app=leetcode.cn id=1941 lang=java
 *
 * [1941] 检查是否所有字符出现次数相同
 * 
 * 134/134 cases passed (7 ms)
 * Your runtime beats 35.08 % of java submissions
 * Your memory usage beats 8.11 % of java submissions (41.4 MB)
 */

// @lc code=start
class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(var i : s.toCharArray()) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        int v = -1;
        for(var enr: map.entrySet()) {
            if (v == -1) {
                v = enr.getValue();
            }else {
                if (v != enr.getValue()) return false;
            }
        }
        return true;
    }
}
// @lc code=end

