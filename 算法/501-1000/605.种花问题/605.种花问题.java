/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 * 
 * 124/124 cases passed (1 ms)
 * Your runtime beats 83.59 % of java submissions
 * Your memory usage beats 5.08 % of java submissions (42.7 MB)
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        var nf = new int[flowerbed.length + 2];
        for(int i = 0; i < flowerbed.length; i++) nf[i + 1] = flowerbed[i];
        
        for(int i = 1; i < nf.length - 1 ; i++) {
            if (nf[i] == 0 && nf[i-1] != 1 && nf[i+1] != 1) {
                nf[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
// @lc code=end

