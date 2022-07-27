
<https://leetcode-cn.com/problems/customers-who-never-order/>

```sql
SELECT Name AS Customers FROM Customers 
WHERE Customers.Id NOT IN
    (SELECT CustomerId FROM Orders)
```

time:380

