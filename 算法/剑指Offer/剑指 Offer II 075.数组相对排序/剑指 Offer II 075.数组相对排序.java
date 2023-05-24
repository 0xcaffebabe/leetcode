/*
 * @lc app=leetcode.cn id=剑指 Offer II 075 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 075] 数组相对排序
 * 
 * 16/16 cases passed (6 ms)
 * Your runtime beats 8.22 % of java submissions
 * Your memory usage beats 52.56 % of java submissions (40.4 MB)
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



/*
// @lcpr case=start
// [2,3,1,3,2,4,6,7,9,2,19]\n[2,1,4,3,9,6]\n
// @lcpr case=end

 */

