
<https://leetcode-cn.com/problems/occurrences-after-bigram/>

```java
class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] arr = text.split(" ");
        for(int i=2;i<arr.length;i++){
            if (first.equals(arr[i-2]) && second.equals(arr[i-1])) list.add(arr[i]);
        }
        return list.toArray(new String[]{});
    }
}
```

time:1 beat:93

