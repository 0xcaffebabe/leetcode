
<https://leetcode-cn.com/problems/count-items-matching-a-rule/>

```java
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        return (int)items
                .stream()
                .filter(list -> {
                    if ("type".equals(ruleKey)) return list.get(0).equals(ruleValue);
                    else if ("color".equals(ruleKey)) return list.get(1).equals(ruleValue);
                    else if ("name".equals(ruleKey)) return list.get(2).equals(ruleValue);
                    return false;
                })
                .count();
    }
}
```

time:5 beat: 57

