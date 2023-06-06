/*
 * @lc app=leetcode.cn id=剑指 Offer II 058 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer II 058] 日程表
 * 
 * 107/107 cases passed (17 ms)
 * Your runtime beats 90.93 % of java submissions
 * Your memory usage beats 20.94 % of java submissions (43.3 MB)
 */

// @lc code=start
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
// ["MyCalendar","book","book","book"]\n[[],[10,20],[15,25],[20,30]]\n
// @lcpr case=end

 */

