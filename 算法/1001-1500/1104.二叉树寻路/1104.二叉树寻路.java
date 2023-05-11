/*
 * @lc app=leetcode.cn id=1104 lang=java
 * @lcpr version=21907
 *
 * [1104] 二叉树寻路
 * 
 * 44/44 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 57.33 % of java submissions (39.2 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        int level = getLevel(label);
        List<Integer> ans = new ArrayList<>();
        ans.add(label);
        // 反向，需要转换
        if (level % 2 == 0) label = ori(label, level);

        while(label > 1) {
            level--;
            // 当前父节点 = 当前父节点的位置在正常的完全二叉树的数
            label = ori(label / 2, level);
            ans.add(label);
            // 恢复临时变量
            label = ori(label, level);
        }

        Collections.reverse(ans);
        return ans;
    }

    /**
     * 某个数的位置在正常的完全二叉树的数
     */
    private int ori(int val, int level) {
        if (level % 2 != 0) return val;

        int max = (int)Math.pow(2, level) - 1;
        int min = (int)Math.pow(2, level - 1);
        return max - (val - min);
    }

    private int getLevel(int val) {
        int cnt = 1;
        int st = 1;
        while(st < val) {
            st *= 2;
            cnt++;
        }
        if (st == val) return cnt;
        else return cnt - 1;
    }
}
// @lc code=end



/*
// @lcpr case=start
// 14\n
// @lcpr case=end

// @lcpr case=start
// 26\n
// @lcpr case=end

// @lcpr case=start
// 11226\n
// @lcpr case=end

// @lcpr case=start
// 16\n
// @lcpr case=end

// @lcpr case=start
// 32\n
// @lcpr case=end

 */

