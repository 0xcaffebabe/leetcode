/*
 * @lc app=leetcode.cn id=1356 lang=java
 *
 * [1356] 根据数字二进制下 1 的数目排序
 * 
 * 77/77 cases passed (22 ms)
 * Your runtime beats 7.52 % of java submissions
 * Your memory usage beats 10.84 % of java submissions (42.2 MB)
 */

// @lc code=start
class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int[] sortByBits(int[] arr) {
        List<Integer> tmp = new ArrayList<>();
        for(var i : arr) tmp.add(i);
        Collections.sort(tmp, (a, b) -> {
            int x = get(a);
            int y = get(b);
            return x == y ? a - b : x - y;
        });
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++) ans[i] = tmp.get(i);
        return ans;
    }

    int get(int i) {
        var cnt = 0;
        while(i > 0) {
            cnt += i % 2;
            i /= 2;
        }
        return cnt;
    }
}
// @lc code=end

