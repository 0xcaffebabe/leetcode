
<https://leetcode-cn.com/problems/kids-with-the-greatest-number-of-candies/>

```java
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i : candies) {
            if (i > max) max = i;
        }
        List<Boolean> ans = new ArrayList<>(candies.length);
        for(int i : candies) {
            ans.add(i + extraCandies >= max);
        }
        return ans;
    }
}
```

time:0 beat:100

