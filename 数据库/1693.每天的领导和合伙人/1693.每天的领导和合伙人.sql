--
-- @lc app=leetcode.cn id=1693 lang=mysql
--
-- [1693] 每天的领导和合伙人
-- 22/22 cases passed (570 ms)
-- Your runtime beats 32.3 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)
--

-- @lc code=start
# Write your MySQL query statement below
SELECT 
  date_id,
  make_name, 
  COUNT(DISTINCT lead_id) unique_leads,
  COUNT(DISTINCT partner_id) unique_partners
FROM DailySales
GROUP BY date_id,make_name
-- @lc code=end

