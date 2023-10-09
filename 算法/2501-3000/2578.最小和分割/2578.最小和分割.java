/*
 * @lc app=leetcode.cn id=2578 lang=java
 * @lcpr version=
 *
 * [2578] 最小和分割
 * 
 * 140/140 cases passed (1 ms)
 * Your runtime beats 91 % of java submissions
 * Your memory usage beats 61.5 % of java submissions (38.2 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int splitNum(int num) {
        List<Integer> list = new ArrayList<>();
        while(num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        Collections.sort(list);
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) num1 = num1 * 10 + list.get(i);
            else num2 = num2 * 10 + list.get(i);
        }
        return num1 + num2;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 4325\n
// @lcpr case=end

// @lcpr case=start
// 687\n
// 123456789\n
// @lcpr case=end

 */

