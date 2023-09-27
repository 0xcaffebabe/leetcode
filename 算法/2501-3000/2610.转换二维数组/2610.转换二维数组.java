/*
 * @lc app=leetcode.cn id=2610 lang=java
 * @lcpr version=
 *
 * [2610] 转换二维数组
 * 
 * 1035/1035 cases passed (12 ms)
 * Your runtime beats 6.81 % of java submissions
 * Your memory usage beats 5.11 % of java submissions (43.5 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    int[] nums;
    public List<List<Integer>> findMatrix(int[] nums) {
        this.nums = nums;
        
        List<List<Integer>> ans = new ArrayList<>();
        int length = maxLength();
        // System.out.println(length);
        for(int i = 0; i < length; i++) ans.add(new ArrayList<>());
        Set<String> contain = new HashSet<>();
        for(var num : nums) {
            for(int i = 0; i < length; i++) {
                if (!contain.contains(num + "-" + i)) {
                    contain.add(num + "-" + i);
                    ans.get(i).add(num);
                    break;
                }
            }
        }
        return ans;
        
    }
    int maxLength() {
        int[] has = new int[201];
        for(var i : nums) has[i]++;
        int max = 0;
        for(var i : has) max = Math.max(i, max);
        return max;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [1,3,4,1,2,3,1]\n
// @lcpr case=end

// @lcpr case=start
// [1,2,3,4]\n
// [1]\n
// [1,1]\n
// [1,2]\n
// @lcpr case=end

 */

