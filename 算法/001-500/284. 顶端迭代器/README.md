
<https://leetcode-cn.com/problems/peeking-iterator/>

```java
class PeekingIterator implements Iterator<Integer> {

    private ArrayList<Integer> list = new ArrayList<>();
    private int pos=0;

	public PeekingIterator(Iterator<Integer> iterator) {
	    while(iterator.hasNext()) list.add(iterator.next());
	}
	
	public Integer peek() {
        return list.get(pos);
	}
	
	@Override
	public Integer next() {
        return list.get(pos++);
	}
	
	@Override
	public boolean hasNext() {
	    return pos < list.size();
	}
}
```

time: 5 beat:99

