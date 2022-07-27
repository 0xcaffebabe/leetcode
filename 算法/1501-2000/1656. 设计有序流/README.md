
<https://leetcode-cn.com/problems/design-an-ordered-stream/>

```java
class OrderedStream {
    private String[] data;
    private int ptr = 1;
    public OrderedStream(int n) {
        data = new String[n + 1];
    }
    
    public List<String> insert(int idKey, String value) {
        data[idKey] = value;
        List<String> ans = new ArrayList<>();
        int i = ptr;
        for (;i< data.length;i++){
            if (data[i] != null) ans.add(data[i]);
            else break;
        }
        ptr = i % data.length;
        return ans;
    }
}
```

time: 78 beat: 98

