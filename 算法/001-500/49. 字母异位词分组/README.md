
<https://leetcode-cn.com/problems/group-anagrams/>

```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> map = new HashMap<>(128);
        int i = 0;
        List<List<String>> list = new ArrayList<>();
        for(String s : strs) {
            var arr = s.toCharArray();
            Arrays.sort(arr);
            String key = Arrays.toString(arr);
            if (!map.containsKey(key)){
                map.put(key, i);
                i++;
                list.add(new ArrayList<>());
                list.get(list.size() -1).add(s);
            }else{
                int index = map.get(key);
                list.get(index).add(s);
            }
        }
        return list;
    }
}
```

耗时：10

