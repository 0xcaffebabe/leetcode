
<https://leetcode-cn.com/problems/design-hashmap/>

```java
class MyHashMap {
    private static final int SIZE = 1000001;
    private Integer[] data = new Integer[SIZE];
    
    public void put(int key, int value) {
        data[key % SIZE] = value;
    }
    
    public int get(int key) {
        Integer i = data[key % SIZE];
        if (i == null) return -1;
        return i;
    }
    
    public void remove(int key) {
        data[key % SIZE] = null;
    }
}
```

耗时：30

