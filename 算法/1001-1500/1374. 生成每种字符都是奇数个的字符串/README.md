
<https://leetcode-cn.com/problems/generate-a-string-with-characters-that-have-odd-counts/>

```py
class Solution(object):
    def generateTheString(self, n):
        if n % 2 == 0 and (n / 2) % 2 == 0:
            return 'x' * (n/2-1) + 'y' *(n/2-1) + 'zd'
        elif n % 2 == 0 and (n / 2) % 2 == 1:
            return 'x' * (n/2) + 'y' *(n/2)
        elif n % 2 != 0:
            return 'x' * n
        else:
            return 'error'

```

time:12 beat:96

