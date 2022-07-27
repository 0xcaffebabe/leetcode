
<https://leetcode-cn.com/problems/minimum-time-difference/>

```java
class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size()>1440) return 0;

        List<Integer> list = new ArrayList<>(16);
        for(String time: timePoints) {
            String[] arr = time.split(":");
            list.add(Integer.parseInt(arr[0])*60 + Integer.parseInt(arr[1]));
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<list.size();i++) {
            min = Math.min(min, list.get(i) - list.get(i-1));
        }
        min = Math.min(min, list.get(0) + 1440 - list.get(list.size()-1));
        return min;
    }
}
```

time:4 beat:69

