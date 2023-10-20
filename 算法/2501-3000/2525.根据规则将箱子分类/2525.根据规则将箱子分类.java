/*
 * @lc app=leetcode.cn id=2525 lang=java
 * @lcpr version=
 *
 * [2525] 根据规则将箱子分类
 * 
 * 50/50 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 16.8 % of java submissions (38.7 MB)
 */

// @lc code=start
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = false;
        boolean isHeavy = false;
        long volumne = 1L * length * width * height;
        if (length >= 10000 || width >= 10000 || height >= 10000) isBulky = true;
        if (volumne >= 10_0000_0000L) isBulky = true;
        if (mass >= 100) isHeavy = true;
        if (isBulky && isHeavy) return "Both";
        if (!isBulky && !isHeavy) return "Neither";
        if (isBulky && !isHeavy) return "Bulky";
        if (!isBulky && isHeavy) return "Heavy";
        return "Neither";
    }
}
// @lc code=end



/*
// @lcpr case=start
// 1000\n35\n700\n300\n
// @lcpr case=end

// @lcpr case=start
// 200\n50\n800\n50\n
// 200\n50\n800\n50\n
// 2000\n5000\n8000\n100\n
// 2000\n50000\n8000\n10\n
// 2\n50000\n8\n100\n
// @lcpr case=end

 */

