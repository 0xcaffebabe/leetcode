import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2215 lang=java
 *
 * [2215] 找出两数组的不同
 * 
 * 202/202 cases passed (13 ms)
 * Your runtime beats 33.23 % of java submissions
 * Your memory usage beats 50.15 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(var i : nums1) s1.add(i);
        for(var i : nums2) s2.add(i);
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        Set<Integer> ss1 = new HashSet<>();
        Set<Integer> ss2 = new HashSet<>();
        for(var i : nums1) {
            if (!s2.contains(i) && !ss1.contains(i)) ans.get(0).add(i);
            ss1.add(i);
        }
        for(var i : nums2) {
            if (!s1.contains(i) && !ss2.contains(i)) ans.get(1).add(i);
            ss2.add(i);
        }
        return ans;
    }
}
// @lc code=end

