
<https://leetcode-cn.com/problems/flipping-an-image/>

```java
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] a: A){
            int p = 0,q = a.length - 1;
            while(p <= q) {
                int t = a[q];
                a[q] = a[p];
                a[p] = t;
                if (a[q] == 0) a[q]=1;
                else a[q] = 0;

                if (p == q) break;
                
                if (a[p] == 0) a[p]=1;
                else a[p] = 0;
                p++;q--;
            }
        }
        return A;
    }
}
```

time:0 beat: 100

