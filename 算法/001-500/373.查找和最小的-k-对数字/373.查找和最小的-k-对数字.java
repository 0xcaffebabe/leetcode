import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=373 lang=java
 *
 * [373] 查找和最小的 K 对数字
 * 
 * 35/35 cases passed (31 ms)
 * Your runtime beats 49.17 % of java submissions
 * Your memory usage beats 25.46 % of java submissions (59 MB)
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

