/*
 * @lc app=leetcode.cn id=剑指 Offer II 060 lang=java
 * @lcpr version=21907
 *
 * [剑指 Offer II 060] 出现频率最高的 k 个数字
 * 
 * 21/21 cases passed (15 ms)
 * Your runtime beats 21.52 % of java submissions
 * Your memory usage beats 5 % of java submissions (46.8 MB)
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



/*
// @lcpr case=start
// [1,1,1,2,2,3]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1]\n1\n
// @lcpr case=end

 */

