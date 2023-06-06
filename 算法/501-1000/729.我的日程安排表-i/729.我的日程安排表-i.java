/*
 * @lc app=leetcode.cn id=729 lang=java
 * @lcpr version=21908
 *
 * [729] 我的日程安排表 I
 * 
 * 107/107 cases passed (23 ms)
 * Your runtime beats 77.17 % of java submissions
 * Your memory usage beats 32.87 % of java submissions (43.4 MB)
 */

// @lc code=start

import java.util.TreeSet;

class MyCalendar {
    TreeSet<int[]> data = new TreeSet<>((a,b) -> {
        if (a[0] >= b[1]) return 1;
        if (a[1] <= b[0]) return -1;
        return 0;
    });
    public MyCalendar() {}
    
    public boolean book(int start, int end) {
        var pair = new int[]{start, end};
        if (data.contains(pair)) return false;
        data.add(pair);
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
// @lc code=end



/*
// @lcpr case=start
// ["MyCalendar", "book", "book", "book"]\n[[], [10, 20], [15, 25], [20, 30]]\n
// @lcpr case=end

 */

