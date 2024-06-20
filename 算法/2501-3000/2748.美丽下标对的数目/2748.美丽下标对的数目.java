/*
 * @lc app=leetcode.cn id=2748 lang=java
 * @lcpr version=
 *
 * [2748] 美丽下标对的数目
 * 
 * 3005/3005 cases passed (30 ms)
 * Your runtime beats 13.18 % of java submissions
 * Your memory usage beats 90.91 % of java submissions (43.2 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countBeautifulPairs(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                int a = getFirst(nums[i]);
                int b = getLast(nums[j]);
                if (gcd(a, b) == 1) ans++;
            }
        }
        return ans;
    }

    int getFirst(int a) {
        if (a >= 0 && a < 10) return a;
        if (a >= 10 && a < 100) return a / 10;
        if (a >= 100 && a < 1000) return a / 100;
        if (a >= 1000 && a < 10000) return a / 1000;
        return -1;
    }

    int getLast(int a) {
        if (a >= 0 && a < 10) return a;
        if (a >= 10 && a < 100) return a % 10;
        if (a >= 100 && a < 1000) return getLast(a % 100);
        if (a >= 1000 && a < 10000) return getLast(a % 1000);
        return -1;
    }

    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,5,1,4]\n
// [532,522,353,691,2441,2082,2477,2293,1449,268,2141,203,523,1063,1259,79,2419,1081,1224,1204,1933,179,1579,917,2355,702,1653,356,909,1763,1107,1277,284,1668,2453,233,1367,1714,276,1369,496,1609,2429,206,504,594,1428]\n
// @lcpr case=end

// @lcpr case=start
// [11,21,12]\n
// @lcpr case=end

 */

