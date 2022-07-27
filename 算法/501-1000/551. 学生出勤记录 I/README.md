
<https://leetcode-cn.com/problems/student-attendance-record-i/>

```java
class Solution {
    public boolean checkRecord(String s) {
        int a = 2;
        boolean lateInTripleDay = false;

        for(int i = 0;i<s.length();i++) if (s.charAt(i) == 'A') a--;

        int p = 0, q = 2;
        while(q < s.length()) {
            if (s.charAt(p) == 'L' && s.charAt(q-1) == 'L' && s.charAt(q) == 'L') lateInTripleDay = true;
            p++;q++;
        }

        return a > 0 && !lateInTripleDay;
    }
}
```

time：1 beat: 41

