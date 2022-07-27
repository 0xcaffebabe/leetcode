
<https://leetcode-cn.com/problems/sign-of-the-product-of-an-array/>

```java

class Solution {
    public int arraySign(int[] nums) {
        boolean n = true;
        for(int i : nums){
            if (i == 0) return 0;
            if (n && i < 0) {
                n = false;
                continue;
            }
            if (n && i > 0) {
                n = true;
                continue;
            }
            if (!n && i > 0) {
                n = false;
                continue;
            }
            if (!n && i < 0) {
                n = true;
                continue;
            }
        }
        if (n) return 1;
        else return -1;

    }
}
```
time: 1 beat:29

