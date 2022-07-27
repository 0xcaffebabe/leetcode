
<https://leetcode-cn.com/problems/swap-salary/submissions/>

```sql
UPDATE salary 
SET sex = CASE sex WHEN 'f' THEN 'm'
            WHEN 'm' THEN 'f'
           END
```

time:192