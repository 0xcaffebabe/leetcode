
<https://leetcode-cn.com/problems/reverse-bits/>

```java
uint32_t reverseBits(uint32_t n) {
    int map[32];
    int i = 0;
    uint32_t ret = 0;
    const uint32_t p = 1;
    while(n > 0){
        map[31-i] = n%2;
        n /= 2;
        i++;
    }
    for(;i<32;i++) map[31-i] = 0;

    for(i=0;i<32;i++){
        if (map[i] != 0){
            if (i == 0) ret+=1;
            else ret += p << i;
        }
    }
    return ret;
}
```

耗时：0

