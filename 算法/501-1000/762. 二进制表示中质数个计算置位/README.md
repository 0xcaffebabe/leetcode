
<https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/>

```java
class Solution {
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> set = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19,23,29,31));
        // int[] map = new int[]{2,3,5,7,11,13,17,19,23,29,31};
        int ans = 0;
        for(int i = left; i <= right; i++) {
            int cnt = Integer.bitCount(i);
            int n = i;
            // while(n > 0) {
            //     if (n % 2 == 1) cnt++;
            //     n /=2;
            // }
            if (set.contains(cnt)) ans++;
            // for(int j: map) if (j == cnt) ans++;

        }
        return ans;

    }
}
```

time:7 beat:43

