/*
 * @lc app=leetcode.cn id=剑指 Offer II 035 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 035] 最小时间差
 * 
 * 113/113 cases passed (4 ms)
 * Your runtime beats 64.84 % of java submissions
 * Your memory usage beats 44.54 % of java submissions (42.4 MB)
 */

// @lc code=start
class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size()>1440) return 0;

        List<Integer> list = new ArrayList<>(16);
        for(String time: timePoints) {
            String[] arr = time.split(":");
            list.add(Integer.parseInt(arr[0])*60 + Integer.parseInt(arr[1]));
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<list.size();i++) {
            min = Math.min(min, list.get(i) - list.get(i-1));
        }
        min = Math.min(min, list.get(0) + 1440 - list.get(list.size()-1));
        return min;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["23:59","00:00"]\n
// @lcpr case=end

// @lcpr case=start
// ["00:00","23:59","00:00"]\n
// @lcpr case=end

 */

