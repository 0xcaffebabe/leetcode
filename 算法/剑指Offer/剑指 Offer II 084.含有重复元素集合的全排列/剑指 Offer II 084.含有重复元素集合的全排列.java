/*
 * @lc app=leetcode.cn id=剑指 Offer II 084 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 084] 含有重复元素集合的全排列
 * 
 * 33/33 cases passed (52 ms)
 * Your runtime beats 6.46 % of java submissions
 * Your memory usage beats 6.05 % of java submissions (43.4 MB) 
 */

// @lc code=start
class Solution {

    List<List<Integer>> ans = new ArrayList<>();
    HashSet<List<Integer>> set = new HashSet<>();
    int[] nums;
    boolean[] vis;
    public List<List<Integer>> permuteUnique(int[] nums) {
        this.nums = nums;
        this.vis = new boolean[nums.length];
        travel(new ArrayList<>());
        return ans;
    }
    void travel(List<Integer> origin) {
        if (origin.size() == nums.length) {
            if (!set.contains(origin)) {
                ans.add(origin);
                set.add(origin);
            }
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if (vis[i]) continue;
            var list = new ArrayList<Integer>();
            list.add(nums[i]);
            for(var o : origin) list.add(o);
            vis[i] = true;
            travel(list);
            vis[i] = false;
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,1,2]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3]\n
// @lcpr case=end

 */

