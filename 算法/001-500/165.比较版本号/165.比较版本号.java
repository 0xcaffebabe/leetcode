import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=165 lang=java
 *
 * [165] 比较版本号
 * 
 * 82/82 cases passed (4 ms)
 * Your runtime beats 5.47 % of java submissions
 * Your memory usage beats 76.86 % of java submissions (39.3 MB)
 */

// @lc code=start
class Solution {
    public int compareVersion(String version1, String version2) {
        List<Integer> a1 = Arrays.stream(version1.split("\\.")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> a2 = Arrays.stream(version2.split("\\.")).map(Integer::parseInt).collect(Collectors.toList());
        // System.out.println(a1);
        // System.out.println(a2);

        int maxLen = Math.max(a1.size(), a2.size());
        for(int i = a1.size(); i < maxLen; i++) a1.add(0);
        for(int i = a2.size(); i < maxLen; i++) a2.add(0);

        for(int i = 0; i < maxLen; i++) {
            if (a1.get(i) < a2.get(i)) return -1;
            else if (a1.get(i) > a2.get(i)) return 1;
        }
        return 0;
    }
}
// @lc code=end

