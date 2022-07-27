
<https://leetcode-cn.com/problems/plus-one/>

```java
class Solution {
    public int[] plusOne(int[] digits) {
        int[] ret = new int[digits.length+1];
        for(int i=0;i<digits.length;i++){
            ret[i+1] = digits[i];
        }
        ret[ret.length-1] = ret[ret.length-1] + 1;
        boolean f = false;
        for(int i=ret.length-1;i>=0;i--){
            if (ret[i] == 10) {
                ret[i] = 0;
                f = true;
                continue;
            }
            if (f) {
                if (ret[i] == 9) {
                    ret[i] = 0;
                    f = true;
                }else {
                    ret[i]++;
                    f= false;
                }
            }
        }
        if (ret[0] == 0) {
            int[] trimArr = new int[ret.length-1];
            System.arraycopy(ret,1,trimArr,0,trimArr.length);
            return trimArr;
        }
        return ret;
    }
}
```

耗时：0

