
<https://leetcode-cn.com/problems/customer-placing-the-largest-number-of-orders/>

```sql
SELECT customer_number FROM (
SELECT customer_number, COUNT(order_number) AS order_count 
FROM Orders 
GROUP BY customer_number
ORDER BY order_count DESC LIMIT 1) AS t;
```

time:500 beat:50

