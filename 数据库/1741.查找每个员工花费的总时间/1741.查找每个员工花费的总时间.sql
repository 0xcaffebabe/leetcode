--
-- @lc app=leetcode.cn id=1741 lang=mysql
--
-- [1741] 查找每个员工花费的总时间

-- 22/22 cases passed (557 ms)
-- Your runtime beats 48.85 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)
--

-- @lc code=start
SELECT event_day AS day, emp_id, SUM(out_time - in_time) AS total_time FROM Employees
GROUP BY event_day, emp_id
-- @lc code=end

