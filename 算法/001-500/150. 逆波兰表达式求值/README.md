
<https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/>

```java
class Solution {
    public int evalRPN(String[] tokens) {
        LinkedList<Integer> s = new LinkedList<>();
        for(String i: tokens) {
            if (i.equals("+")){
                int[] nums = pop2(s);
                s.push(nums[1] + nums[0]);
            }else if (i.equals("-")) {
                int[] nums = pop2(s);
                s.push(nums[1] - nums[0]);
            }else if (i.equals("*")) {
                int[] nums = pop2(s);
                s.push(nums[1] * nums[0]);
            } else if (i.equals("/")) {
                int[] nums = pop2(s);
                s.push((int)(nums[1] / nums[0]));
            }else {
                s.push(Integer.parseInt(i));
            }
        }
        return s.pop();
    }

    private int[] pop2(LinkedList<Integer> s) {
        return new int[]{s.pop(), s.pop()};
    }
}
```

time: 4 beat: 95

