/*
 * @lc app=leetcode.cn id=341 lang=java
 *
 * [341] 扁平化嵌套列表迭代器
 * 
 * 43/43 cases passed (2 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 26 % of java submissions (43.9 MB)
 */

// @lc code=start
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    LinkedList<NestedInteger> queue = new LinkedList<>();
    public NestedIterator(List<NestedInteger> nestedList) {
        travel(nestedList);
    }

    private void travel(List<NestedInteger> nestedList) {
        for(var i : nestedList) {
            if (i.isInteger()) queue.offer(i);
            else travel(i.getList());
        }
    }

    @Override
    public Integer next() {
        return queue.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
// @lc code=end

