
<https://leetcode-cn.com/problems/single-element-in-a-sorted-array/>

```java
int ans = 0;
for(int i : nums) ans ^= i;
return ans;
```

time:1 beat:34

