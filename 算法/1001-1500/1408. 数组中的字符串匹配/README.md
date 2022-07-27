
<https://leetcode-cn.com/problems/string-matching-in-an-array/>

```java
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>(16);
        for(String i : words) {
            for(String j : words) {
                if (j.equals(i)) continue;
                if (j.contains(i)) {
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}
```

time:4 beat:62

