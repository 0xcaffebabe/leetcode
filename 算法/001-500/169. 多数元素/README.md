
<https://leetcode-cn.com/problems/majority-element/submissions/>

- 解法1：使用哈希表存储每个数字出现的频率

```java
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i :nums){
            if (map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(int i:map.keySet()){
            if (map.get(i)>n){
                return i;
            }
        }
        return -1;
    }
}
```

耗时：16ms

- 解法2：摩尔投票法？

```java
class Solution {
    public int majorityElement(int[] nums) {
        if (nums.length == 0) return 0;
        int cnt = 0, last = nums[0];
        for(int i : nums){
            if (i == last) cnt++;
            else cnt--;
            if (cnt < 0) {
                last = i;
                cnt = 0;
            }
        }
        return last;
    }
}
```

