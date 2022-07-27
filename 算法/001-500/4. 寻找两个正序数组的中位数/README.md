
<https://leetcode-cn.com/problems/median-of-two-sorted-arrays/>

- 不符合时间复杂度的解法

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] merged = new int[n];
        int p = 0, q = 0;
        int i = 0;
        while(p < nums1.length && q < nums2.length) {
            if (nums1[p] <= nums2[q]) merged[i++] = nums1[p++];
            else merged[i++] = nums2[q++];
        }
        while(p < nums1.length) merged[i++] = nums1[p++];
        while(q < nums2.length) merged[i++] = nums2[q++];

        if (n % 2 == 0) return (merged[n / 2] + merged[n / 2 - 1]) / 2.0;
        return merged[n / 2];
    }
}
```

time:1 beat:100

