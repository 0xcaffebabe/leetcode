
<https://leetcode-cn.com/problems/department-highest-salary/submissions/>

```sql
SELECT Department.Name AS Department, t1.Name AS Employee, Salary  FROM Employee AS t1
    JOIN Department ON DepartmentId = Department.Id 
WHERE t1.Salary =
(
    SELECT Salary FROM Employee AS t2 WHERE t1.DepartmentId = t2.DepartmentId
    ORDER BY Salary DESC LIMIT 1
)
```

