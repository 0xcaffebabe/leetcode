
<https://leetcode-cn.com/problems/count-numbers-with-unique-digits/>

```java
class Solution {

    public int countNumbersWithUniqueDigits(int n) {
        int[] data = new int[10];
        data[0] = 1;
        data[1] = 10;
        for(int i = 2; i <= n; i++) {
            data[i] += data[i-1];

            data[i] += (data[i-1]-data[i-2]) * (10-(i-1));
        }
        return data[n];
    }
}
```

time:0 beat:100

