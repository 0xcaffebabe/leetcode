/*
 * @lc app=leetcode.cn id=2108 lang=java
 * @lcpr version=
 *
 * [2108] 找出数组中的第一个回文字符串
 * 
 * 266/266 cases passed (3 ms)
 * Your runtime beats 42.17 % of java submissions
 * Your memory usage beats 33.91 % of java submissions (42.7 MB)
 */

// @lc code=start
class Solution {
    public String firstPalindrome(String[] words) {
        for(var i : words)
            if (check(i)) return i;
        return "";
    }

    boolean check(String str) {
        var arr = str.toCharArray();
        for(int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) return false;
        }
        return true;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["abc","car","ada","racecar","cool"]\n
// @lcpr case=end

// @lcpr case=start
// ["notapalindrome","racecar"]\n
// @lcpr case=end

// @lcpr case=start
// ["def","ghi"]\n
// ["abba","ghi"]\n
// @lcpr case=end

 */

