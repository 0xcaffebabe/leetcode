/*
 * @lc app=leetcode.cn id=406 lang=java
 * @lcpr version=
 *
 * [406] 根据身高重建队列
 * 
 * 36/36 cases passed (16 ms)
 * Your runtime beats 7.04 % of java submissions
 * Your memory usage beats 31.93 % of java submissions (43.4 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (b,a) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        ArrayList<int[]> list = new ArrayList<>();
        // for(var i : people) 
        //     System.out.print(Arrays.toString(i) + "|");
        // System.out.println();
        for(var i: people) {
            if (i[1] == 0) {
                if (list.size() == 0) {
                    list.add(i);
                } else {
                    for(int j = 0; j < list.size(); j++) {
                        if (list.get(j)[0] > i[0]) {
                            list.add(j, i);
                            break;
                        }
                    }
                }
            } else {
                int k = i[1];
                for(int j = 0; j < list.size(); j++) {
                    if (list.get(j)[0] >= i[0]) k--;
                    if (k == 0) {
                        list.add(j + 1, i);
                        break;
                    }
                }
            }
        }
        int[][] ans = new int[people.length][2];
        for(int i = 0; i < list.size(); i++) 
            ans[i] = list.get(i);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[7,0],[4,4],[7,1],[5,0],[6,1],[5,2]]\n
// @lcpr case=end

// @lcpr case=start
// [[6,0],[5,0],[4,0],[3,2],[2,2],[1,4]]\n
// [[ 5, 0 ], [ 7, 0 ], [ 5, 2 ], [ 6, 1 ], [ 4, 4 ], [ 7, 1 ]] \n
// @lcpr case=end

 */

