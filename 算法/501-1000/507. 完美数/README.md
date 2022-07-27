
<https://leetcode-cn.com/problems/perfect-number/>

```java
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1 || num == 2) return false;
        long sum = 0;
        for(int i = 1;i<= num / 2;i++){
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num ;
    }
}
```

time: 2000+ beat:20

