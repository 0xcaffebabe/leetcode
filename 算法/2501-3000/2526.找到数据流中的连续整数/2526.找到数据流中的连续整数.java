/*
 * @lc app=leetcode.cn id=2526 lang=java
 * @lcpr version=21907
 *
 * [2526] 找到数据流中的连续整数
 * 26ms
 */

// @lc code=start
class DataStream {
    int val;
    int k;
    int cnt = 0;
    public DataStream(int value, int k) {
        val = value;
        this.k = k;
    }
    
    public boolean consec(int num) {
        if (num == val) cnt++;
        else cnt = 0;
        if (cnt >= k) return true;
        return false;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
// @lc code=end



/*
// @lcpr case=start
// ["DataStream", "consec", "consec", "consec", "consec"][[4, 3], [4], [4], [4], [3]]\n
// @lcpr case=end

 */

