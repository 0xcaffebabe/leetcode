/*
 * @lc app=leetcode.cn id=191 lang=c
 *
 * [191] 位1的个数
 */

// @lc code=start
int hammingWeight(uint32_t n) {
    int count = 0;
    while(n != 0){
        if (n % 2 != 0) count++;
        n >>= 1;
    }
    return count;
}
// @lc code=end

