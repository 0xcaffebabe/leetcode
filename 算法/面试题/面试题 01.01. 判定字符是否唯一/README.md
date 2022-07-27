
<https://leetcode-cn.com/problems/is-unique-lcci/>

- 解法1：暴力解法

```java
class Solution {
    public boolean isUnique(String astr) {
        int l = astr.length();
        for(int i = 0;i<l;i++){
            for(int j =0;j<l;j++){
                if (j == i) continue;
                if (astr.charAt(i)  == astr.charAt(j)) return false;
            }
        }
        return true;
    }
}
```

耗时：0

