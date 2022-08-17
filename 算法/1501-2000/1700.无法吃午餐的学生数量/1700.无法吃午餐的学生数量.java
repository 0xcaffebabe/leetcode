/*
 * @lc app=leetcode.cn id=1700 lang=java
 *
 * [1700] 无法吃午餐的学生数量
 * 
 * 55/55 cases passed (1 ms)
 * Your runtime beats 43.75 % of java submissions
 * Your memory usage beats 84.58 % of java submissions (39.1 MB)
 */

// @lc code=start
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        LinkedList<Integer> stck = new LinkedList<>();
        LinkedList<Integer> que = new LinkedList<>();
        for(int i = sandwiches.length - 1; i >=0; i--) stck.push(sandwiches[i]);
        for(var i : students) que.offer(i);

        int huns = 0;
        while(true) {
            int stu = que.pop();
            if (stck.peek() != stu) {
                huns++;
                que.offer(stu);
            }else {
                huns = 0;
                stck.pop();
            }
            if (huns == que.size()) return que.size();
        }
    }
}
// @lc code=end

