/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 * 
 * 56/56 cases passed (5 ms)
 * Your runtime beats 12.27 % of java submissions
 * Your memory usage beats 79.55 % of java submissions (41.3 MB)
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i : nums1) {
            map1.putIfAbsent(i, 0);
            map1.put(i, map1.get(i) + 1);
        }
        for(int i : nums2) {
            map2.putIfAbsent(i, 0);
            map2.put(i, map2.get(i) + 1);
        }
        List<Integer> list = new ArrayList<>();
        for(var enr: map1.entrySet()) {
            if (map2.containsKey(enr.getKey())) {
                int n = Math.min(enr.getValue(), map2.get(enr.getKey()));
                for(int i = 0; i < n; i++) list.add(enr.getKey());
            }
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }
}
// @lc code=end

