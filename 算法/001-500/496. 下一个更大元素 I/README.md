
<https://leetcode-cn.com/problems/next-greater-element-i/>

```java
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> stack = new LinkedList<>();

        for(int num: nums2) {
            // 单调栈 只有栈顶的元素比当前元素小 当前元素才可以入栈
            // 只有当栈空了 或者栈顶元素大于当前元素, 才将当前元素入栈
            // 否则当前元素就是栈顶元素右边的下一个元素
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0; i < ans.length; i++) ans[i] = map.getOrDefault(nums1[i], -1);
        return ans;
    }
}
```

time:2 beat:98

