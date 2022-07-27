
给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写

<https://leetcode-cn.com/problems/valid-palindrome/>

- 解法

类似于前面的验证回文数字，分别正序与逆序将字符串入栈，比较两个栈

```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        LinkedList<Character> stack1 = new LinkedList<>();
        LinkedList<Character> stack2 = new LinkedList<>();
        for (int i=s.length()-1;i>=0;i--){
            char c =s.charAt(i);
            if ((c >=48 && c <=57) || (c >=97 && c <=122)){
                stack1.addLast(c);
                stack2.addFirst(c);
            }
        }
        return stack1.equals(stack2);
    }
}
```

