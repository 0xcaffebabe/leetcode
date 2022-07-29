--
-- @lc app=leetcode.cn id=1757 lang=mysql
--
-- [1757] 可回收且低脂的产品
--

-- 22/22 cases passed (612 ms)
-- Your runtime beats 21.05 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)

-- @lc code=start
SELECT product_id FROM Products
WHERE low_fats = 'Y' AND recyclable = 'Y'

-- @lc code=end

