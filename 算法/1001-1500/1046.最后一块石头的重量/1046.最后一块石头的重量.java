import java.util.Arrays;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=1046 lang=java
 *
 * [1046] 最后一块石头的重量
 * 
 * 70/70 cases passed (1 ms)
 * Your runtime beats 82.57 % of java submissions
 * Your memory usage beats 90.28 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> que = new PriorityQueue<>((a,b) -> b-a);
        for(var i : stones) que.offer(i);
        while(que.size() > 1) {
            int y = que.poll();
            int x = que.poll();
            if (x != y)  que.offer(y - x);
        }
        return que.size() == 1 ? que.peek() : 0;
    }
}
// @lc code=end

