
<https://leetcode-cn.com/problems/na-ying-bi/>

```java
class Solution {
    public int minCount(int[] coins) {
        int count = 0;
        for (int i:coins){
            count+=i/2;
            if (i % 2!= 0){
                count+=1;
            }
        }
        return count;
    }
}
```

耗时:0

