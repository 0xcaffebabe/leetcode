/*
 * @lc app=leetcode.cn id=2391 lang=java
 * @lcpr version=
 *
 * [2391] 收集垃圾的最少总时间
 * 
 * 75/75 cases passed (66 ms)
 * Your runtime beats 13.14 % of java submissions
 * Your memory usage beats 98.86 % of java submissions (58 MB)
 */

// @lc code=start
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int g = 0, p = 0, m = 0;
        for(int i = garbage.length - 1; i > 0; i--) {
            if (garbage[i].indexOf('M') != -1 || m != 0)
                m += travel[i - 1] + size(garbage[i], 'M');
            if (garbage[i].indexOf('G') != -1 || g != 0)
                g += travel[i - 1] + size(garbage[i], 'G');
            if (garbage[i].indexOf('P') != -1 || p != 0)
                p += travel[i - 1] + size(garbage[i], 'P');
            
        }
        m += size(garbage[0], 'M');
        g += size(garbage[0], 'G');
        p += size(garbage[0], 'P');
        // System.out.println(g + "|" + p + "|" + m);
        return g + p + m;
    }

    int size(String str, char c) {
        int cnt = 0;
        for(var i : str.toCharArray())
            if (i == c) cnt++;
        return cnt;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["G","P","GP","GG"]\n[2,4,3]\n
// @lcpr case=end

// @lcpr case=start
// ["MMM","PGM","GP"]\n[3,10]\n
// ["MMM","PGM"]\n[3]\n
// @lcpr case=end

 */

