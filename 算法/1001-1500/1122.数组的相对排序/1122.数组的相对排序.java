import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1122 lang=java
 *
 * [1122] 数组的相对排序
 * 
 * 16/16 cases passed (5 ms)
 * Your runtime beats 12.17 % of java submissions
 * Your memory usage beats 47.37 % of java submissions (41 MB)
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] rank = new int[1001];
        Arrays.fill(rank, -1);
        for(int i = 0; i < arr2.length; i++) rank[arr2[i]] = i;

        return Arrays.stream(arr1).boxed().sorted((a,b) -> {
            if (rank[a] != -1 && rank[b] != -1) return rank[a] - rank[b];
            if (rank[a] == -1 && rank[b] == -1) return a - b;
            if (rank[a] == -1) return 1;
            if (rank[b] == -1) return -1;
            return 0;
        }).mapToInt(i -> i).toArray();
    }
}
// @lc code=end

