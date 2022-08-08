/*
 * @lc app=leetcode.cn id=2085 lang=java
 *
 * [2085] 统计出现过一次的公共字符串
 * 
 * 60/60 cases passed (7 ms)
 * Your runtime beats 36.36 % of java submissions
 * Your memory usage beats 5.01 % of java submissions (41.9 MB)
 */

// @lc code=start
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for(var i : words1) {
            map1.putIfAbsent(i, 0);
            map1.put(i, map1.get(i) + 1);
        }
        for(var i : words2) {
            map2.putIfAbsent(i, 0);
            map2.put(i, map2.get(i) + 1);
        }
        int ans = 0;
        for(var key: map1.keySet()) {
            if (map1.containsKey(key) && map2.containsKey(key) && map1.get(key) == 1 && map2.get(key) == 1) ans++;
        }
        return ans;
    }
}
// @lc code=end

