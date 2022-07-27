
<https://leetcode-cn.com/problems/duplicate-emails/>

```sql 
SELECT DISTINCT Email FROM Person AS t
    WHERE EXISTS(
        SELECT * FROM Person AS t1 WHERE t.Id <> t1.Id AND t.Email = t1.Email)
```

time:305
