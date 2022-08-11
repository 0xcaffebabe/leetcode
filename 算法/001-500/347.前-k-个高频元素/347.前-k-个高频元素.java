/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 * 
 * 21/21 cases passed (14 ms)
 * Your runtime beats 28.8 % of java submissions
 * Your memory usage beats 8.67 % of java submissions (44.3 MB)
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> que = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(var i : nums) {
            map.putIfAbsent(i, 0);
            map.put(i, map.get(i) + 1);
        }
        for(var enr : map.entrySet()) {
            que.offer(new int[]{enr.getKey(), enr.getValue()});
            if (que.size() > k) que.remove();
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) ans[i] = que.remove()[0];
        return ans;
    }
}
// @lc code=end

