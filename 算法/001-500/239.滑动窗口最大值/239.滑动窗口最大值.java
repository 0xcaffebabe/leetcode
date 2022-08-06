/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 * 
 * 51/51 cases passed (87 ms)
 * Your runtime beats 10.79 % of java submissions
 * Your memory usage beats 36.82 % of java submissions (58.4 MB)
 */

// @lc code=start
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        /* 
         * 
         * 利用最大堆的性质 维护每一个滑动窗口的最大值
         * 然后在每次的遍历中将当前元素与堆顶元素比较 
         * 如果发现堆顶元素处于窗口左边界之外，就将该元素移除
         */
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        PriorityQueue<int[]> que = new PriorityQueue<>((b,a) -> 
            a[0] != b[0] ? a[0] - b[0]: a[1] - b[1]
        );
        for(int i = 0; i < k; i++) que.offer(new int[]{nums[i], i});
        ans[0] = que.peek()[0];

        for(int i = k; i < n; i++) {
            // 如果发现堆顶的元素不在窗口内 弹掉
            while(!que.isEmpty() && que.peek()[1] <= i - k) que.poll();
            que.offer(new int[]{nums[i], i});
            ans[i - k + 1] = que.peek()[0];
        }
        return ans;
    }
}
// @lc code=end

