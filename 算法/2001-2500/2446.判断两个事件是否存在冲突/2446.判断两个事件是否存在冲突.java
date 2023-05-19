/*
 * @lc app=leetcode.cn id=2446 lang=java
 * @lcpr version=21907
 *
 * [2446] 判断两个事件是否存在冲突
 * 
 * 129/129 cases passed (2 ms)
 * Your runtime beats 5.17 % of java submissions
 * Your memory usage beats 5.03 % of java submissions (39.5 MB)
 */

// @lc code=start
class Solution {
    public boolean haveConflict(String[] e1, String[] e2) {
        var t1 = new int[]{cv(e1[0]), cv(e1[1])};
        var t2 = new int[]{cv(e2[0]), cv(e2[1])};

        boolean[] map = new boolean[1440];
        for(int i = t1[0]; i <= t1[1]; i++) map[i] = true;
        for(int i = t2[0]; i <= t2[1]; i++) if (map[i]) return true;
        return false;
    }

    private int cv(String time) {
        var h = Integer.parseInt(time.split(":")[0]);
        var m = Integer.parseInt(time.split(":")[1]);
        return h * 60 + m;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["01:15","02:00"]\n["02:00","03:00"]\n
// @lcpr case=end

// @lcpr case=start
// ["01:00","02:00"]\n["01:20","03:00"]\n
// @lcpr case=end

// @lcpr case=start
// ["10:00","11:00"]\n["14:00","15:00"]\n
// @lcpr case=end

// @lcpr case=start
// ["00:00","23:58"]\n["23:58","23:59"]\n
// @lcpr case=end

 */

