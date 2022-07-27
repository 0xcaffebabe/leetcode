
<https://leetcode-cn.com/problems/simplify-path/>

```java
class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        LinkedList<String> s = new LinkedList<>();
        for(String dir: dirs) {
            if (dir == null || "".equals(dir)) {
                continue;
            }
            if (".".equals(dir)) {
                continue;
            }
            if ("..".equals(dir)) {
                if (!s.isEmpty()) s.pop();
                continue;
            }
            s.push(dir);
        }
        Collections.reverse(s);
        return "/" + s.stream().collect(Collectors.joining("/"));
    }
}
```

time:8 beat:16

