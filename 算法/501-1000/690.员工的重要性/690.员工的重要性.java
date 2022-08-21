import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=690 lang=java
 *
 * [690] 员工的重要性
 * 
 * 102/102 cases passed (5 ms)
 * Your runtime beats 58.8 % of java submissions
 * Your memory usage beats 96.61 % of java submissions (41.7 MB)
 */

// @lc code=start
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for(var e: employees) map.put(e.id, e);

        LinkedList<Integer> stack = new LinkedList<>(Arrays.asList(id));
        int ans = 0;
        while(!stack.isEmpty()) {
            var emp = stack.pop();
            ans += map.get(emp).importance;
            stack.addAll(map.get(emp).subordinates);
        }
        return ans;
    }
}
// @lc code=end

