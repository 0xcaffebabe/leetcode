
<https://leetcode-cn.com/problems/combine-two-tables/>

```sql
SELECT FirstName, LastName,Address.City,Address.State
    FROM Person LEFT JOIN Address
        ON Address.PersonId = Person.PersonId
```

time:247