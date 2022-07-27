
<https://leetcode-cn.com/problems/ugly-number/>

- 解法1

```java
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        while(n % 5 == 0) n /= 5;
        while(n % 3 == 0) n /= 3;
        while(n % 2 == 0) n /= 2;
        return n == 1;
    }
}
```

time:0 beat:100

- 解法2

```java
class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        for(int i = 4; i <= n / 2; i ++) {
            if (i == 5) continue;
            if (n % i == 0 && !check(i)) return false;
        }
        return check(n);
    }

    private boolean check(int n) {
        if (n < 0) return false;
        return n % 2 == 0 || n % 3 == 0 || n % 5 == 0;
    }
}
```

超时

