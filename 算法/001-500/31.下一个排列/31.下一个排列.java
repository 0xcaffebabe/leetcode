/*
 * @lc app=leetcode.cn id=31 lang=java
 * @lcpr version=21907
 *
 * [31] 下一个排列
 * 
 * 265/265 cases passed (9 ms)
 * Your runtime beats 1.37 % of java submissions
 * Your memory usage beats 72.45 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int p = -1;
        for(int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                p = i-1;
                break;
            }
        }
        if (p == -1) {
            sort(nums, 0, n);
            return;
        }

        int q = -1;
        for(int i = n - 1; i >= 0; i--) {
            if (nums[i] > nums[p]) {
                q = i;
                break;
            }
        }
        if (q == -1) {
            sort(nums, 0, n);
            return;
        }

        int t = nums[p];
        nums[p] = nums[q];
        nums[q] = t;
        System.out.println(p + "|" + q);
        sort(nums, p + 1, n);
    }

    private void sort(int[] nums, int st, int end) {
        for(int i = st; i < end; i++) {
            int min = i;
            for(int j = i + 1; j < end; j++) {
                if (nums[j] < nums[i]) min = j;
            }
            int tt = nums[min];
            nums[min] = nums[i];
            nums[i] = tt;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

// @lcpr case=start
// [3,2,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,5]\n
// @lcpr case=end

// @lcpr case=start
// [1,1,5,8,6,4,7,5,3,6,63,2,21]\n
// @lcpr case=end

// @lcpr case=start
// [1]\n
// @lcpr case=end

 */

