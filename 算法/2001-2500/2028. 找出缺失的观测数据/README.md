
<https://leetcode-cn.com/problems/find-missing-observations/>

```java
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int total = rolls.length + n;
        int exceptSum = total * mean;
        int sum = 0;
        for(int i : rolls) sum += i;
        
        // 计算预期总数与实际总数的差值
        int difference = exceptSum - sum;
        if (difference / n > 6) return new int[]{};
        if (difference < n) return new int[]{};

        int[] ans = new int[n];
        
        // 如果差值刚好能被n整除 则结果就是每个数都是一样，即 差值/n
        int base = 0;
        if (difference % n == 0) {
            base = difference/n;
            for(int i = 0; i < ans.length; i++) ans[i] = base;
        } else {
            // 否则计算 差值/n=base 剩下来的多余的量 在每轮循环 base + 1, 多余的量--， 当多余的量为0时, base不进行+1
            base = difference / n;
            int remaining = difference % n;
            if (base >= 6) return new int[]{};
            for(int i = 0; i < ans.length; i++) {
                if (remaining >= 1) ans[i] = base + 1;
                else ans[i] = base;
                remaining--;
            }
        }
        return ans;

    }
}
```

time:3 beat:82

