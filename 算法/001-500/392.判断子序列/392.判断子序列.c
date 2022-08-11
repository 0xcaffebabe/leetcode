/*
 * @lc app=leetcode.cn id=392 lang=c
 *
 * [392] 判断子序列
 * 
 * 18/18 cases passed (0 ms)
 * Your runtime beats 100 % of c submissions
 * Your memory usage beats 71.55 % of c submissions (5.4 MB)
 */

// @lc code=start


bool isSubsequence(char * s, char * t){
  int p = 0;
  int q = 0;
  while (s[p] && t[q]) if (s[p] == t[q++]) p++;
  
  return p == strlen(s);
}
// @lc code=end

