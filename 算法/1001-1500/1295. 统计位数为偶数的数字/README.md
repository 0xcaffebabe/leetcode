
<https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/>

```java
class Solution {
    public int findNumbers(int[] nums) {
        int ret = 0;
        for(int i : nums){
            if (String.valueOf(i).length() %2 == 0) ret++;
        }
        return ret;
    }
}
```

耗时：2

