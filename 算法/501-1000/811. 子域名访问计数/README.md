
<https://leetcode-cn.com/problems/subdomain-visit-count/>

```java
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<>(256);
        for (String s : cpdomains){
            String[] a = s.split(" ");
            int count = Integer.valueOf(a[0]);
            String domain = a[1];
            for(int i=domain.length()-1;i>=0;i--){
                char c = domain.charAt(i);
                if (c == '.') {
                    String subDomain = domain.substring(i+1,domain.length());
                    Integer oldCount = map.get(subDomain);
                    if (oldCount == null){
                        map.put(subDomain, count);
                    }else {
                        map.put(subDomain, oldCount + count);
                    }
                }
                if (i == 0){
                    Integer oldCount = map.get(domain);
                    if (oldCount == null){
                        map.put(domain, count);
                    }else {
                        map.put(domain, oldCount + count);
                    }
                }
            }
        }
        List<String> ret = new ArrayList<>();
        for (String s: map.keySet()){
            ret.add(map.get(s) + " " + s);
        }
        return ret;
    }
}
```

耗时：21

