
<https://leetcode-cn.com/problems/rising-temperature/submissions/>

```java
SELECT t2.Id FROM Weather AS t2, Weather AS t1
    WHERE DATE_SUB(t2.RecordDate, INTERVAL 1 DAY) = t1.RecordDate
    AND t2.Temperature > t1.Temperature
```

time:261