
<https://leetcode-cn.com/problems/sum-of-two-integers/submissions/>

```java
class Solution {
    public int getSum(int a, int b) {
        if (b >0){
            while(b>0){
                a++;
                b--;
            }
        }else if (b<0){
            while(b<0){
                a--;
                b++;
            }
        }
        return a;
    }
}
```

耗时:946

