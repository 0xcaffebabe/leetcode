
<https://leetcode-cn.com/problems/reverse-string/>

使用前后双指针 两个指针往中间靠 交换元素

```java
class Solution {
    public void reverseString(char[] s) {
        if (s.length <=1) return;
        int l=0,r=s.length-1;
        while(l<r){
            char tmp = s[l];
            s[l]=s[r];
            s[r]=tmp;
            l++;r--;
        }
    }
}
```

