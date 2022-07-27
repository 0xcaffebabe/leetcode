
<https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/>

```java
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[]{};
        List<Integer> ret = new ArrayList<>();
        int n = nums.length - k+1;
        for(int i =0;i<n;i++){
            int max = nums[i];
            int p = i,q = k+i;
            for(int j = p;j<q;j++) if (nums[j] > max) max = nums[j];
            ret.add(max);
        }

        int[] ra = new int[ret.size()];
        for(int i = 0;i<ret.size();i++){
            ra[i] = ret.get(i);
        }
        return ra;
    }
}
```

time: 40 beat:10

