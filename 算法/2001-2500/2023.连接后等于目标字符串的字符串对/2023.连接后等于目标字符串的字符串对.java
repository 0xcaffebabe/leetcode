/*
 * @lc app=leetcode.cn id=2023 lang=java
 * @lcpr version=
 *
 * [2023] 连接后等于目标字符串的字符串对
 * 
 * 117/117 cases passed (23 ms)
 * Your runtime beats 46.07 % of java submissions
 * Your memory usage beats 5.62 % of java submissions (44.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if ((nums[i] + nums[j]).equals(target)) ans++;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["777","7","77","77"]\n"7777"\n
// @lcpr case=end

// @lcpr case=start
// ["123","4","12","34"]\n"1234"\n
// @lcpr case=end

// @lcpr case=start
// ["1","1","1"]\n"11"\n
// ["1","1"]\n"11"\n
// ["1","1"]\n"12"\n
// @lcpr case=end

 */

