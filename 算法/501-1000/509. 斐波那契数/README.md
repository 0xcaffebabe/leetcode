
给定 N，计算 F(N)。

<https://leetcode-cn.com/problems/fibonacci-number/submissions/>

- 解法1

递归

```java
class Solution {
    public int fib(int N) {
        if (N == 0 || N == 1) {
            return N;
        }
        return fib(N-1) + fib(N-2);
    }
}
```

耗时:9ms

- 解法2

使用缓存避免重复的计算

```java
class Solution {
    private int[] cache = new int[100];
    public int fib(int N) {
        return fib0(N);
    }
    private int fib0(int N){
        if (N == 0 || N == 1) {
            return N;
        }
        if (cache[N] == 0){
            cache[N] = fib1(N);
        }
        return cache[N];
    }
     private int fib1(int N){
        if (N == 0 || N == 1) {
            return N;
        }
        return fib0(N-1) + fib0(N-2);
    }
}
```

耗时:0ms

