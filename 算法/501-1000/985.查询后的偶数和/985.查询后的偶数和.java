/*
 * @lc app=leetcode.cn id=985 lang=java
 * @lcpr version=
 *
 * [985] 查询后的偶数和
 * 
 * 58/58 cases passed (4 ms)
 * Your runtime beats 58.12 % of java submissions
 * Your memory usage beats 11.97 % of java submissions (46.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        for(var i : nums) if (i % 2 == 0) sum += i;
        // System.out.println(sum);
        int[] ans = new int[nums.length];
        int cnt = 0;
        for(var q: queries) {
            if ((q[0] + nums[q[1]]) % 2 == 0) {
                if (nums[q[1]] % 2 == 0) sum += q[0];
                else sum += q[0] + nums[q[1]];
            } else {
                if (nums[q[1]] % 2 == 0) sum -= nums[q[1]];
            }
            // System.out.println(sum);
            nums[q[1]] += q[0];
            ans[cnt++] = sum;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3,4]\n[[1,0],[-3,1],[-4,0],[2,3]]\n
//  [5,7,9,11]\n [[2,0],[-3,2],[6,1],[-4,3]]\n
//  [2,4,6,8]\n [[3,1],[-2,0],[1,3],[-5,2]]\n
//  [0,0,0,0]\n [[1,0],[1,1],[1,2],[1,3]]\n
//  [10,20,30,40]\n [[-5,0],[-10,1],[5,2],[15,3]]
// @lcpr case=end

 */

