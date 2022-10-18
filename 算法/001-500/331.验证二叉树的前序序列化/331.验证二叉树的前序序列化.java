import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=331 lang=java
 *
 * [331] 验证二叉树的前序序列化
 * 
 * 151/151 cases passed (7 ms)
 * Your runtime beats 23.19 % of java submissions
 * Your memory usage beats 66.57 % of java submissions (41.2 MB)
 */

// @lc code=start
class Solution {
    public boolean isValidSerialization(String preorder) {
        var arr = preorder.split(",");
        var s = new LinkedList<String>();
        for(var i : arr) {
            s.push(i);
            while (s.peek().equals("#") 
                    && s.size() >= 3 
                    && s.get(1).equals("#") 
                    && !s.get(2).equals("#")) {
                s.pop(); s.pop(); s.pop();
                s.push("#");
            }
        }
        // System.out.println(s);
        return s.size() == 1 && s.peek().equals("#");
    }
}
// @lc code=end

