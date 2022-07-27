
<https://leetcode-cn.com/problems/sum-of-unique-elements/>

```java
class Solution {
    public int sumOfUnique(int[] nums) {
        int[] map = new int[101];
        for(int i : nums) map[i]++;

        int sum = 0;
        for(int i = 0; i < map.length; i++) {
            if (map[i] == 1) sum += i;
        }
        return sum;
    }
}
```

time:0 beat:100

