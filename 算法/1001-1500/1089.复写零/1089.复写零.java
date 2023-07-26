/*
 * @lc app=leetcode.cn id=1089 lang=java
 * @lcpr version=21912
 *
 * [1089] 复写零
 * 
 * 31/31 cases passed (3 ms)
 * Your runtime beats 33.54 % of java submissions
 * Your memory usage beats 8.08 % of java submissions (43 MB)
 */

// @lc code=start

import java.util.LinkedList;

class Solution {
    public void duplicateZeros(int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        for(var i : arr) {
            if (i == 0) list.add(0);
            list.add(i);
        }
        for(int i = 0; i < arr.length; i++) 
            arr[i] = list.poll();
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,0,2,3,0,4,5,0]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// [1]\n
// [0]\n
// @lcpr case=end

 */

