
<https://leetcode-cn.com/problems/self-dividing-numbers/>

```java
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <= right; i++) if (check(i)) ans.add(i);
        return ans;
    }

    private boolean check(int x) {
        if (x == 0) return false;
        int origin = x;
        while (x!=0){
            int i = x%10;
            x/=10;
            if (i == 0) return false;
            if (origin % i != 0) return false;
        }
        return true;
    }
}
```

time:1 beat:98

