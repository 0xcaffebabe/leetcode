
<https://leetcode-cn.com/problems/pascals-triangle/>

```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> seq = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if (j == 0 || j == i) {
                    seq.add(1);
                    continue;
                }
                seq.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            list.add(seq);
        }
        return list;
    }
}
```

耗时：1

