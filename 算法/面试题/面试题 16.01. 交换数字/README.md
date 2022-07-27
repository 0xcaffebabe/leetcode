
<https://leetcode-cn.com/problems/swap-numbers-lcci/>

```py
class Solution(object):
    def swapNumbers(self, numbers):
        numbers[0] = numbers[1] + numbers[0]
        numbers[1] = numbers[0] - numbers[1]
        numbers[0] = numbers[0] - numbers[1]
        return numbers
```

time:12 beat:91

