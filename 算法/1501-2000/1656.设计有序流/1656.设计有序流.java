/*
 * @lc app=leetcode.cn id=1656 lang=java
 *
 * [1656] 设计有序流
 * 
 * 101/101 cases passed (71 ms)
 * Your runtime beats 85.54 % of java submissions
 * Your memory usage beats 24.5 % of java submissions (42.9 MB)
 */

// @lc code=start
class OrderedStream {
    private String[] data;
    private int ptr = 1;
    public OrderedStream(int n) {
        data = new String[n + 1];
    }
    
    public List<String> insert(int idKey, String value) {
        data[idKey] = value;
        List<String> ans = new ArrayList<>();
        int i = ptr;
        for (;i< data.length;i++){
            if (data[i] != null) ans.add(data[i]);
            else break;
        }
        ptr = i % data.length;
        return ans;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
// @lc code=end

