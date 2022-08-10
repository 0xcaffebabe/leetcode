/*
 * @lc app=leetcode.cn id=2053 lang=java
 *
 * [2053] 数组中第 K 个独一无二的字符串
 * 
 * 66/66 cases passed (9 ms)
 * Your runtime beats 20.62 % of java submissions
 * Your memory usage beats 67.38 % of java submissions (40.9 MB)
 */

// @lc code=start
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> unique = new ArrayList<>();
        for(var i : arr) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        for(var enr: map.entrySet()) {
            if (enr.getValue() == 1) unique.add(enr.getKey());
        }
        if (k > unique.size()) return "";
        return unique.get(k- 1);
    }
}
// @lc code=end

