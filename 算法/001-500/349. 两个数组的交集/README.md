
<https://leetcode-cn.com/problems/intersection-of-two-arrays/>

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int i : nums1) {
            s1.add(i);
        }
        for(int i : nums2) {
            s2.add(i);
        }
        if (s1.size() < s2.size()) {
            var t = s1;
            s1 = s2;
            s2 = t;
        }

        Iterator<Integer> it = s1.iterator();
        while(it.hasNext()){
            var e = it.next();
            if (!s2.contains(e)) it.remove();
        }

        int[] ret = new int[s1.size()];
        int count = 0;
        for(int i :s1){
            ret[count] = i;
            count++;
        }
        return ret;
    }
}
```

耗时：3

