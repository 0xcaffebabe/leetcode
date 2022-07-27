
<https://leetcode-cn.com/problems/increasing-triplet-subsequence/>

```java
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;

        // 每轮循环最小的三个值
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
        // 记录a,b,c是否存在
        boolean a1 = false, b1 = false , c1 = false;
        for(int i : nums) {
            if (i <= a) {
                a = i;
                a1 = true;
            }
            if (i <= b && i > a) {
                b = i;
                b1 = true;
            }
            if (i <= c && i > a && i > b) {
                c = i;
                c1 = true;
            }

            if (a1 && b1 && c1 && a < b && b < c ) return true;
        }
        return false;

    }
}
```

time:3, beat:23

