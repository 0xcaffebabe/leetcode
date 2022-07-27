
<https://leetcode-cn.com/problems/uncommon-words-from-two-sentences/>

```java
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = new HashMap<>(16);
        Map<String, Integer> map2 = new HashMap<>(16);
        for(var s: s1.split(" ")){
            Integer val = map1.get(s);
            if (val != null) map1.put(s, val + 1);
            else map1.put(s, 1);
        }

        for(var s: s2.split(" ")){
            Integer val = map2.get(s);
            if (val != null) map2.put(s, val + 1);
            else map2.put(s, 1);
        }

        List<String> result = new ArrayList<>(16);
        for(var key: map1.keySet()) {
            if (map1.get(key) == 1 && map2.get(key) == null) result.add(key);
        }
        for(var key: map2.keySet()) {
            if (map2.get(key) == 1 && map1.get(key) == null) result.add(key);
        }

        return result.toArray(new String[]{});
    }
}
```

time:2 beat:99

