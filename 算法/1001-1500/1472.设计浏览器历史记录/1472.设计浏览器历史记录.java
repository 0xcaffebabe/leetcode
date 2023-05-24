/*
 * @lc app=leetcode.cn id=1472 lang=java
 * @lcpr version=21908
 *
 * [1472] 设计浏览器历史记录
 * 45ms/100%
 */

// @lc code=start
class BrowserHistory {
    String[] urls = new String[5001];
    int cur = 1;
    int lim = 1;
    public BrowserHistory(String homepage) {
        urls[cur] = homepage;
    }
    
    public void visit(String url) {
        urls[++cur] = url;
        lim = cur;
    }
    
    public String back(int steps) {
        cur -= steps;
        if (cur < 1) cur = 1;
        return urls[cur];
    }
    
    public String forward(int steps) {
        cur += steps;
        if (cur > lim) cur = lim;
        return urls[cur];
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
// @lc code=end



/*
// @lcpr case=start
// ["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]\n[["leetcode.com"],["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
// @lcpr case=end

 */

