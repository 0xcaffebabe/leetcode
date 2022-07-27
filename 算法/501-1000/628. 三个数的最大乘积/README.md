
<https://leetcode-cn.com/problems/maximum-product-of-three-numbers/>

```java
class Solution {
    public int maximumProduct(int[] nums) {
        // 三个最大正整数
        // 两个最小负数 一个最大正整数
        int p1 = -1000,p2 = -1000,p3 = -1000;
        int n1 = 1000,n2 = 1000;
        for(int i : nums) {
            if (i >= p3) {
                p1 = p2;
                p2 = p3;
                p3 = i;
            }else if (i >= p2) {
                p1 = p2;
                p2 = i;
            }else if (i >= p1) {
                p1 = i;
            }

            if (i <= n1) {
                n2 = n1;
                n1 = i;
            }else if (i <= n2) {
                n2 = i;
            }
        }
        //System.out.println(p1 + "," + p2 + "," + p3 + "|" + n1 + "," + n2);
        return Math.max(p1 * p2 * p3, n1 * n2 * p3);

    }
}
```

time:2 beat:99

