/*
 * @lc app=leetcode.cn id=1529 lang=java
 * @lcpr version=
 *
 * [1529] 最少的后缀翻转次数
 * 
 * 79/79 cases passed (7 ms)
 * Your runtime beats 41.89 % of java submissions
 * Your memory usage beats 5.4 % of java submissions (43.7 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int minFlips(String target) {
        int ans = 0;
        char next = '0';
        for(int i = 0; i < target.length(); i++){
            if(target.charAt(i) != next){
                ans++;
                next = target.charAt(i);
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "10111"\n
// "111"\n
// "001"\n
// "10"\n
// "110"\n
// "011"\n
// "00"\n
// "11"\n
// "0"\n
// "1"\n
// "1111111111111111111"\n
// "0000000000000000000"\n
// @lcpr case=end

// @lcpr case=start
// "101"\n
// @lcpr case=end

// @lcpr case=start
// "00000"\n
// @lcpr case=end

 */

