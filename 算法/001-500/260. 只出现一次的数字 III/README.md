
<https://leetcode-cn.com/problems/single-number-iii/>

```java
class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            if (map.containsKey(i)) map.remove(i);
            else map.put(i, i);
        }
        int[] ans = new int[2];
        int cnt = 0;
        for(int key: map.keySet()) ans[cnt++] = key;
        return ans;
    }
}
```

time: 5 beat: 17

