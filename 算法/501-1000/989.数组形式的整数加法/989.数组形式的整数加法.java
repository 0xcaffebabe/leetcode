import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=989 lang=java
 *
 * [989] 数组形式的整数加法
 * 
 * 152/152 cases passed (4 ms)
 * Your runtime beats 24.98 % of java submissions
 * Your memory usage beats 6.69 % of java submissions (43.4 MB)
 */

// @lc code=start
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(var i : num) list1.add(i);
        while(k > 0) {
            list2.add(k % 10);
            k /= 10;
        }
        Collections.reverse(list2);
        int p = 1;
        int q = 1;
        int adi = 0;
        // System.out.println(list1);
        // System.out.println(list2);
        List<Integer> ans = new ArrayList<>();
        while(p <= list1.size() && q <= list2.size()) {
            int c1 = list1.get(list1.size() - p) ;
            int c2 = list2.get(list2.size() - q) ;
            if (c1 + c2 + adi >= 10) {
                ans.add( c1 + c2 + adi - 10);
                adi = 1;
            } else {
                ans.add( c1 + c2 + adi);
                adi = 0;
            }
            p++;
            q++;
        }
        while(p <= list1.size()) {
            int c1 = list1.get(list1.size() - p) ;
            if (c1 + adi >= 10) {
                ans.add( c1 + adi - 10);
                adi = 1;
            } else {
                ans.add( c1 + adi);
                adi = 0;
            }
            p++;
        }
        while(q <= list2.size()) {
            int c2 = list2.get(list2.size() - q) ;
            if (c2 + adi >= 10) {
                ans.add( c2 + adi - 10);
                adi = 1;
            } else {
                ans.add( c2 + adi);
                adi = 0;
            }
            q++;
        }
        if (adi == 1) ans.add( 1);
        Collections.reverse(ans);
        return ans;
    }
}
// @lc code=end

