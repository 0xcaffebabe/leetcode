
<https://leetcode-cn.com/problems/decompress-run-length-encoded-list/>

```python
class Solution(object):
    def decompressRLElist(self, nums):
        ret = []
        for i in range(len(nums)/2):
            for j in range(nums[2*i]):
                ret.append(nums[2*i+1])
        return ret
```

耗时：24

