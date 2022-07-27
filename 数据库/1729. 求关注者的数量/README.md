<https://leetcode-cn.com/problems/find-followers-count/>

```sql
SELECT user_id, (SELECT COUNT(*) FROM Followers AS t1 WHERE t1.user_id = t2.user_id ) AS followers_count 
FROM Followers AS t2 GROUP BY user_id ORDER BY user_id
```

time:800 beat:5
