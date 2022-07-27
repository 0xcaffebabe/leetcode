
<https://leetcode-cn.com/problems/number-of-1-bits/>

```c
int hammingWeight(uint32_t n) {
    int count = 0;
    while(n != 0){
        if (n % 2 != 0) count++;
        n >>= 1;
    }
    return count;
}
```

耗时：4

