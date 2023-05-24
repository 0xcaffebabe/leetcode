/*
 * @lc app=leetcode.cn id=剑指 Offer II 061 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 061] 和最小的 k 个数对
 * 
 * 25/25 cases passed (4 ms)
 * Your runtime beats 68.83 % of java submissions
 * Your memory usage beats 29.75 % of java submissions (42.9 MB)
 */

// @lc code=start
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> que = new PriorityQueue<>((a,b) -> {
            return (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]]);
        });
        
        int m = nums1.length;
        int n = nums2.length;
        // 数组1的所有数跟数组2第一个数组合
        for(int i = 0; i < Math.min(m, k); i++) que.offer(new int[]{i, 0});

        List<List<Integer>> ans = new ArrayList<>();
        while(k > 0 && !que.isEmpty()) {
            var item = que.poll();
            ans.add(Arrays.asList(nums1[item[0]], nums2[item[1]]));
            // 数组2的数还没用完 继续使用最小的数组1的下标进行组合
            if (item[1] + 1 < n) que.offer(new int[]{item[0], item[1] + 1});
            k--;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,7,11]\n[2,4,6]\n3\n
// @lcpr case=end

// @lcpr case=start
// [1,1,2]\n[1,2,3]\n2\n
// @lcpr case=end

// @lcpr case=start
// [1,2]\n[3]\n3\n
// @lcpr case=end

 */

