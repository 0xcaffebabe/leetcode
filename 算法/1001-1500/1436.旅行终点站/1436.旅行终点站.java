/*
 * @lc app=leetcode.cn id=1436 lang=java
 *
 * [1436] 旅行终点站
 * 
 * 103/103 cases passed (2 ms)
 * Your runtime beats 74.24 % of java submissions
 * Your memory usage beats 32.38 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for(var path: paths) map.put(path.get(0), path.get(1));
        
        for(var key: map.keySet()) {
            while(map.containsKey(key)) key = map.get(key);
            return key;
        }
        return "";
    }
}
// @lc code=end

