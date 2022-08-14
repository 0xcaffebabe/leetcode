import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=2032 lang=java
 *
 * [2032] 至少在两个数组中出现的值
 * 
 * 288/288 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 6.78 % of java submissions (42.5 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] map1 = new int[101];
        int[] map2 = new int[101];
        int[] map3 = new int[101];
        for(var i : nums1) map1[i] = 1;
        for(var i : nums2) map2[i] = 1;
        for(var i : nums3) map3[i] = 1;

        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < map1.length; i++) {
            int c = map1[i] + map2[i] + map3[i];
            if (c >=2 ) ans.add(i);
        }
        return ans;
    }
}
// @lc code=end

