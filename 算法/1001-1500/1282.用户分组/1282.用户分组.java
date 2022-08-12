/*
 * @lc app=leetcode.cn id=1282 lang=java
 *
 * [1282] 用户分组
 * 
 * 103/103 cases passed (6 ms)
 * Your runtime beats 68.9 % of java submissions
 * Your memory usage beats 69.82 % of java submissions (42 MB)
 */

// @lc code=start
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            map.putIfAbsent(size, new ArrayList<>());
            var list = map.get(size);
            if (list.size() == size) {
                ans.add(list);
                map.put(size, new ArrayList<>());   
                list = map.get(size);
            }
            list.add(i);
        }
        for(var v: map.values()) ans.add(v);
        return ans;
    }
}
// @lc code=end

