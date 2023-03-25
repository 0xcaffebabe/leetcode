--
-- @lc app=leetcode.cn id=185 lang=mysql
--
-- [185] 部门工资前三高的所有员工
-- 19/19 cases passed (985 ms)
-- Your runtime beats 35.12 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)
--

-- @lc code=start
# Write your MySQL query statement below
SELECT Department,Employee,Salary FROM
(
SELECT d.name AS Department, e.name AS Employee, e.salary AS Salary,
dense_rank() over (PARTITION by e.departmentId
                     Order by e.salary DESC) AS rn
FROM Employee  e LEFT JOIN Department d ON e.departmentId = d.id
) AS t Where rn <= 3
-- @lc code=end

