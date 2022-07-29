--
-- @lc app=leetcode.cn id=1890 lang=mysql
--
-- [1890] 2020年最后一次登录
--

-- 23/23 cases passed (1530 ms)
-- Your runtime beats 5 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)

-- @lc code=start
SELECT user_id, MAX(time_stamp) AS last_stamp FROM Logins
WHERE YEAR(time_stamp) = 2020
GROUP BY user_id
-- @lc code=end

