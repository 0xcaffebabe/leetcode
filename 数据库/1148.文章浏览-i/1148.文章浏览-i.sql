--
-- @lc app=leetcode.cn id=1148 lang=mysql
--
-- [1148] 文章浏览 I
--
-- 13/13 cases passed (432 ms)
-- Your runtime beats 50.47 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)

-- @lc code=start
SELECT DISTINCT author_id AS id FROM Views
WHERE author_id = viewer_id ORDER BY id
-- @lc code=end

