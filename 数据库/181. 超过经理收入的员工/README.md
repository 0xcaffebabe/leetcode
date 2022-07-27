
<https://leetcode-cn.com/problems/employees-earning-more-than-their-managers/>

```sql
SELECT Name AS Employee FROM Employee t1
    WHERE Salary > 
        (SELECT Salary FROM Employee AS t2 WHERE t2.Id = t1.ManagerId)
```

time:772
