--
-- @lc app=leetcode.cn id=1050 lang=mysql
--
-- [1050] 合作过至少三次的演员和导演
--
-- 12/12 cases passed (223 ms)
-- Your runtime beats 94.87 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)

-- @lc code=start
SELECT actor_id, director_id FROM ActorDirector
GROUP BY actor_id, director_id HAVING COUNT(*) >= 3
-- @lc code=end

