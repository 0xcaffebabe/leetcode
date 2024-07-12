/*
 * @lc app=leetcode.cn id=面试题 16.10 lang=java
 * @lcpr version=
 *
 * [面试题 16.10] 生存人数
 * 
 * 71/71 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 71.32 % of java submissions (44.1 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxAliveYear(int[] birth, int[] death) {
        int[] delta = new int[102];
        for(var year : birth) delta[year - 1900]++;
        for(var year: death) delta[year + 1 - 1900]--;

        for(int i = 0; i < delta.length - 1; i++) 
            delta[i + 1] += delta[i];
        
        // System.out.println(Arrays.toString(delta));

        int max = 0;
        int ans = 0;
        for(int i = 0; i < delta.length; i++) {
            if (delta[i] > max) {
                ans = i;
                max = delta[i];
            }
        }
        return ans + 1900;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1900, 1901, 1999]\n[1948, 1951, 2000]\n
// [1927,1954,1903,1928,1956,1929,1929,1928,1958,1902,1953,1912,1923,1937,1915,1942,1964,1954,1924,1936,1963,1950,1904,1931,1951,1953,1922,1970,1986,1947,1911,1965,1913,1920,1947,1962,1903,1905,1978,1974,1950,1921,1929,1901,1925,1929,1951,1944,1945]\n[1987,1992,1967,1997,1963,1970,1944,1986,1997,1937,1971,1982,1980,1992,1995,1992,1991,1964,1985,1938,1975,1964,1975,1961,1995,1985,1946,1989,1999,1994,1956,1984,1999,1966,1950,1993,1960,1939,1990,1975,1982,1921,1964,1998,1969,1970,1965,1973,1958]\n
// [1900,1901,1950] \n[1948,1951,2000]\n
// [1900]\n[1900]\n
// [1900]\n[1901]\n
// @lcpr case=end

 */

