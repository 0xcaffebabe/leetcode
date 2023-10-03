/*
 * @lc app=leetcode.cn id=1442 lang=java
 * @lcpr version=
 *
 * [1442] 形成两个异或相等数组的三元组数目
 * 
 * 47/47 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 83.49 % of java submissions (38.8 MB)
 */

// @lc code=start
class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n - 1; i++) {
            int sum = 0;
            for(int k = i; k < n; k++) {
                sum ^= arr[k];
                if (sum == 0 && k > i) ans += k - i;
            }
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,3,1,6,7]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,1,1]\n
// @lcpr case=end

// @lcpr case=start
// [2,3]\n
// @lcpr case=end

// @lcpr case=start
// [1,3,5,7,9]\n
// @lcpr case=end

// @lcpr case=start
// [7,11,12,9,5,2,7,17,22]\n
// @lcpr case=end

 */

