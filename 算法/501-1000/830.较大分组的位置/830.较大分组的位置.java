/*
 * @lc app=leetcode.cn id=830 lang=java
 * @lcpr version=
 *
 * [830] 较大分组的位置
 * 
 * 202/202 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.37 % of java submissions (42.8 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        char[] arr = new char[s.length() + 1];
        for(int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i);
        
        arr[s.length()] = 'A';
        // System.out.println(Arrays.toString(arr));
        int l = 0;
        int r = 1;
        while(r < arr.length) {
            char c1 = arr[r - 1];
            char c2 = arr[r];
            // System.out.println(l + "|" + r);
            if (c1 != c2) {
                if (r - l > 2) ans.add(Arrays.asList(l, r - 1));
                l = r;
            }
            r++;
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abbxxxxzzy"\n
// @lcpr case=end

// @lcpr case=start
// "abc"\n
// @lcpr case=end

// @lcpr case=start
// "abcdddeeeeaabbbcd"\n
// "asdfghjkxcvbnmeeeeeeeeeeeeeee"\n
// "aeaeaeaeaeae"\n
// "eeee"\n
// "e"\n
// "a"\n
// @lcpr case=end

// @lcpr case=start
// "aba"\n
// @lcpr case=end

 */

