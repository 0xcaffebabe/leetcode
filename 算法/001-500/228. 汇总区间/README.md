
<https://leetcode-cn.com/problems/summary-ranges/>

```java
class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return List.of();
        if (nums.length == 1) return List.of(nums[0] + "");

        int n = nums.length;
        int p=0,q=0;
        List<String> ret = new ArrayList<>(20);
        for(int i=0;i<n;i++){
            q = i;
            if (i == n-1){
                ret.add(build(p, q, nums));
                break;
            }
            if (nums[i] != nums[i+1]-1){
                ret.add(build(p,q,nums));
                p = i+1;
            }
        }
        return ret;
    }
    private String build(int p, int q, int[] nums){
        if (q == p){
            return nums[p] + "";
        }else {
            return nums[p] + "->"+nums[q];
        }
    }
}
```

耗时：8

