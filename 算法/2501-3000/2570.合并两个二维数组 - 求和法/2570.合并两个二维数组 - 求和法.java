/*
 * @lc app=leetcode.cn id=2570 lang=java
 * @lcpr version=
 *
 * [2570] 合并两个二维数组 - 求和法
 * 
 * 39/39 cases passed (1 ms)
 * Your runtime beats 88.76 % of java submissions
 * Your memory usage beats 30.77 % of java submissions (43.3 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<int[]> list = new ArrayList<>();
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int p = 0, q = 0;
        while(p < nums1.length && q < nums2.length) {
            var i = nums1[p];
            var j = nums2[q];
            if (i[0] < j[0]) {
                add(i);
                p++;
            } else {
                add(j);
                q++;
            }
        }
        while(p < nums1.length) add(nums1[p++]);
        while(q < nums2.length) add(nums2[q++]);
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++) ans[i] = list.get(i);
        return ans;
    }

    void add(int[] i) {
        if (list.size() == 0) {
            list.add(i);
            return;
        }
        var j = list.get(list.size() - 1);
        if (j[0] == i[0]) j[1] += i[1];
        else list.add(i);
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,2],[2,3],[4,5]]\n[[1,4],[3,2],[4,1]]\n
// @lcpr case=end

// @lcpr case=start
// [[2,4],[3,6],[5,5]]\n[[1,3],[4,3]]\n
// [[1,1]]\n[[1,1]]\n
// [[148,597],[165,623],[306,359],[349,566],[403,646],[420,381],[566,543],[730,209],[757,875],[788,208],[932,695]]\n
// [[74,669],[87,399],[89,165],[99,749],[122,401],[138,16],[144,714],[148,206],[177,948],[211,653],[285,775],[309,289],[349,396],[386,831],[403,318],[405,119],[420,153],[468,433],[504,101],[566,128],[603,688],[618,628],[622,586],[641,46],[653,922],[672,772],[691,823],[693,900],[756,878],[757,952],[770,795],[806,118],[813,88],[919,501],[935,253],[982,385]]\n
// @lcpr case=end

 */

