/*
 * @lc app=leetcode.cn id=2079 lang=java
 * @lcpr version=
 *
 * [2079] 给植物浇水
 * 
 * 40/40 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 52.81 % of java submissions (40.1 MB)
 */

// @lc code=start
class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int ans = 0;
        int oriCap = capacity;
        for(int i = 0; i < plants.length - 1; i++) {
            ans ++;
            capacity -= plants[i];
            if (capacity < plants[i + 1]) {
                ans += i + 1;
                capacity = oriCap;
                ans += i + 1;
            }
        }
        ans++;
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [2,2,3,3]\n5\n
// @lcpr case=end

// @lcpr case=start
// [1,1,1,4,2,3]\n4\n
// @lcpr case=end

// @lcpr case=start
// [7,7,7,7,7,7,7]\n8\n
// @lcpr case=end

 */

