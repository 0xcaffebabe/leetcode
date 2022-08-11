/*
 * @lc app=leetcode.cn id=292 lang=c
 *
 * [292] Nim 游戏
 * 
 * 60/60 cases passed (4 ms)
 * Your runtime beats 100 % of c submissions
 * Your memory usage beats 58.15 % of c submissions (5.3 MB)
 */

// @lc code=start


bool canWinNim(int n){
  return n % 4 != 0;
}
// @lc code=end

