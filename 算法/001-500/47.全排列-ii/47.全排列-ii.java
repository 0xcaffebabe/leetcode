/*
 * @lc app=leetcode.cn id=47 lang=java
 *
 * [47] 全排列 II
 * 
 * 33/33 cases passed (51 ms)
 * Your runtime beats 5.87 % of java submissions
 * Your memory usage beats 89.8 % of java submissions (41.9 MB)
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

