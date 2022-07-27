
<https://leetcode-cn.com/problems/not-boring-movies/>

```sql
SELECT * FROM cinema
WHERE description <> 'boring' AND id %2 =1 
ORDER BY rating DESC
```

time:210
