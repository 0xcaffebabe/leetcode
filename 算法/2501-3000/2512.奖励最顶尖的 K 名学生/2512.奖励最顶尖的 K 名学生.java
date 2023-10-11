/*
 * @lc app=leetcode.cn id=2512 lang=java
 * @lcpr version=
 *
 * [2512] 奖励最顶尖的 K 名学生
 * 
 * 30/30 cases passed (65 ms)
 * Your runtime beats 51.46 % of java submissions
 * Your memory usage beats 67.84 % of java submissions (53.4 MB)
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        Set<String> positive = new HashSet<>();
        Set<String> negative = new HashSet<>();
        for(var i : positive_feedback) positive.add(i);
        for(var i : negative_feedback) negative.add(i);

        int[][] students = new int[student_id.length][2];
        for(int i = 0; i < students.length; i++) {
            students[i][0] = student_id[i];
            int score = 0;
            for(var w: report[i].split(" ")) {
                if (positive.contains(w)) score += 3;
                else if (negative.contains(w)) score -= 1;
            }
            students[i][1] = score;
        }
        Arrays.sort(students, (b, a) -> {
            if (a[1] == b[1]) return b[0] - a[0];
            else return a[1] - b[1];
        });
        // for(var i: students)
            // System.out.print(Arrays.toString(i) + " ");
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < k; i++) ans.add(students[i][0]);
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["smart","brilliant","studious"]\n["not"]\n["this student isstudious","the student is smart"]\n[1,2]\n2\n
// @lcpr case=end

// @lcpr case=start
// ["smart","brilliant","studious"]\n["not"]\n["this student is notstudious","the student is smart"]\n[1,2]\n2\n
// ["smart","brilliant","studious"]\n["not"]\n["this student is not studious","the student is smart"]\n[1,2]\n2\n
// @lcpr case=end

 */

