--
-- @lc app=leetcode.cn id=1587 lang=mysql
--
-- [1587] 银行账户概要 II
--

-- 16/16 cases passed (893 ms)
-- Your runtime beats 11.53 % of mysql submissions
-- Your memory usage beats 100 % of mysql submissions (0 B)

-- @lc code=start
SELECT * FROM 
  (SELECT 
    name,
    (SELECT SUM(amount) FROM Transactions AS t
    WHERE t.account = u.account) AS balance
  FROM Users AS u) AS k
WHERE balance > 10000
-- @lc code=end

