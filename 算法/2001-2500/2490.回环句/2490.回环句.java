/*
 * @lc app=leetcode.cn id=2490 lang=java
 * @lcpr version=21909
 *
 * [2490] 回环句
 * 
 * 266/266 cases passed (1 ms)
 * Your runtime beats 96.22 % of java submissions
 * Your memory usage beats 30.25 % of java submissions (40.2 MB)
 */

// @lc code=start
class Solution {
    public boolean isCircularSentence(String sentence) {
        var arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++) {
            char c1 = arr[i].charAt(arr[i].length() - 1);
            char c2 = arr[(i + 1) % arr.length].charAt(0);
            if (c1 != c2) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "leetcode exercises sound delightful"\n
// "a"\n
// @lcpr case=end

// @lcpr case=start
// "eetcode"\n
// @lcpr case=end

// @lcpr case=start
// "Leetcode is cool"\n
// @lcpr case=end

 */

