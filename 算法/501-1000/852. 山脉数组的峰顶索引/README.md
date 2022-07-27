
<https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/>

```java
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if (arr[i] > arr[max]) max = i;
        }
        return max;
    }
}
```

time:1 beat: 16

