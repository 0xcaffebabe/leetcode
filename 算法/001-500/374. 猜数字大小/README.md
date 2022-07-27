
<https://leetcode-cn.com/problems/guess-number-higher-or-lower/submissions/>

```java
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low+(high-low)/2;
            int ret = guess(mid);
            if (ret == 0){
                return mid;
            }else if (ret == 1){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
    }
}
```

