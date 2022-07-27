
<https://leetcode-cn.com/problems/encode-and-decode-tinyurl/>

```java
import java.util.concurrent.atomic.*;
public class Codec {
    private ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    private volatile AtomicInteger cnt = new AtomicInteger();
    public String encode(String longUrl) {
        map.putIfAbsent(String.valueOf(cnt.incrementAndGet()), longUrl);
        return String.valueOf(cnt.get());
    }

    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
```

time:2 beat: 68

