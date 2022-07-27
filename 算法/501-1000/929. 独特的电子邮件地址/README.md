
<https://leetcode-cn.com/problems/unique-email-addresses/>

```java
class Solution {
    public int numUniqueEmails(String[] emails) {
        List<String> list = new ArrayList<>();
        for(String s: emails){
            String[] a = s.split("@");
            String name = a[0];
            String domain = a[1];
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<name.length();i++){
                char c = name.charAt(i);
                if (c == '+') break;
                if (c != '.') sb.append(c);
            }
            sb.append("@");
            sb.append(domain);
            if (!list.contains(sb.toString())){
                list.add(sb.toString());
            }
        }
        return list.size();
    }
}
```

耗时：12

