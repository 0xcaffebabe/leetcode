import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/*
 * @lc app=leetcode.cn id=398 lang=java
 *
 * [398] 随机数索引
 * 
 * 15/15 cases passed (73 ms)
 * Your runtime beats 90.24 % of java submissions
 * Your memory usage beats 7.43 % of java submissions (51.3 MB)
 */

// @lc code=start
class Solution {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(32);
    public Solution(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        Random rnd = new Random();
        var list = map.get(target);
        return list.get(rnd.nextInt(list.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
// @lc code=end

