
<https://leetcode-cn.com/problems/classes-more-than-5-students/>

```sql
-- 注意对学生姓名去重
SELECT class FROM courses 
GROUP BY class HAVING COUNT(DISTINCT student) >=5
```

time:268
