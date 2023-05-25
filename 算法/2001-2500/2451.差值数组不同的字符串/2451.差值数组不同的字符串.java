/*
 * @lc app=leetcode.cn id=2451 lang=java
 * @lcpr version=21908
 *
 * [2451] 差值数组不同的字符串
 * 
 * 39/39 cases passed (8 ms)
 * Your runtime beats 9.59 % of java submissions
 * Your memory usage beats 11.64 % of java submissions (40.1 MB)
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String oddString(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, String> ans = new HashMap<>();
        for(var i : words) {
            int[] arr = new int[i.length() - 1];
            for(int j = 1; j < i.length(); j++) 
                arr[j - 1] = (i.charAt(j) - 'a') - (i.charAt(j - 1) - 'a');            
            var s = Arrays.stream(arr).mapToObj(v -> String.valueOf(v)).collect(Collectors.joining(","));
            map.put(s, map.getOrDefault(s, 0) + 1);
            ans.put(s, i);
        }
        for(var enr: map.entrySet()) 
            if (enr.getValue() == 1) return ans.get(enr.getKey());
        return null;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["adc","wzy","abc"]\n
// @lcpr case=end

// @lcpr case=start
// ["aaa","bob","ccc","ddd"]\n
// @lcpr case=end

 */

