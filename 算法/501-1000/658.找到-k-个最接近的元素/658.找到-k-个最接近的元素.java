import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=658 lang=java
 *
 * [658] 找到 K 个最接近的元素
 * 
 * 66/66 cases passed (25 ms)
 * Your runtime beats 10.2 % of java submissions
 * Your memory usage beats 17.4 % of java submissions (43.8 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> tmp = new ArrayList<>();
        for(var i : arr) tmp.add(i);
        Collections.sort(tmp, (a,b) -> {
            if (Math.abs(a - x) != Math.abs(b - x)) return Math.abs(a - x) - Math.abs(b - x);
            else return a - b;
        });
        var ans = tmp.subList(0, k);
        Collections.sort(ans);
        return ans;
    }
}
// @lc code=end

