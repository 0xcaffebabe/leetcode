
<https://leetcode-cn.com/problems/image-smoother/>

```java
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] ans = new int[img.length][img[0].length];
        for(int i = 0; i < img.length; i++) {
            for(int j = 0; j < img[i].length; j++) {
                int sum = 0;
                int cnt = 1;
                sum += img[i][j];

                // 左方
                if (i - 1 >= 0) {
                    sum += img[i-1][j];
                    cnt++;
                }
                // 右方
                if (i + 1 < img.length) {
                    sum += img[i+1][j];
                    cnt++;
                }
                // 上方
                if (j - 1 >= 0) {
                    sum += img[i][j-1];
                    cnt++;
                }
                // 下方
                if (j + 1 < img[i].length) {
                    sum += img[i][j+1];
                    cnt++;
                }
                // 左上方
                if (i - 1 >= 0 && j - 1 >= 0) {
                    sum += img[i-1][j-1];
                    cnt++;
                }
                // 右上方
                if (i + 1 < img.length && j - 1 >= 0) {
                    sum += img[i+1][j-1];
                    cnt++;
                }
                // 左下方
                if (i - 1 >= 0 && j + 1 < img[i].length) {
                    sum += img[i-1][j+1];
                    cnt++;
                }
                // 右下方
                if (i + 1 < img.length && j + 1 < img[i].length) {
                    sum += img[i+1][j+1];
                    cnt++;
                }
                int val = sum / cnt;
                ans[i][j] = val;
            }
        }
        return ans;
    }
}
```

time:5 beat:90

