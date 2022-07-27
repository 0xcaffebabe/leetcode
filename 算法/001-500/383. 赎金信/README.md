
<https://leetcode-cn.com/problems/ransom-note/>

```java
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a = new int[128];
        int[] b = new int[128];
        for(int i = 0;i<magazine.length();i++) b[magazine.charAt(i)]++;
        for(int i = 0;i<ransomNote.length();i++) a[ransomNote.charAt(i)]++;

        for(int i = 0;i<128;i++) if (b[i] < a[i]) return false;
        
        return true;
    }
}
```

time:3 beat:33

