
<https://leetcode-cn.com/problems/insert-delete-getrandom-o1/>

```java
class RandomizedSet {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    Random rnd = new Random();

    public RandomizedSet() {

    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        
        // 将数组最后一个位置的值迁到 index 的位置 避免删除导致的数组移动
        int lastVal = list.get(list.size() - 1);
        list.set(index, lastVal);
        list.remove(list.size() - 1);
        map.put(lastVal, index);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        return list.get(rnd.nextInt(list.size()));
    }
}
```

time:21 beat:89

