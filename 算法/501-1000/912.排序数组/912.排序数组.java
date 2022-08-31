import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=912 lang=java
 *
 * [912] 排序数组
 * 
 * 15/15 cases passed (15 ms)
 * Your runtime beats 52.96 % of java submissions
 * Your memory usage beats 66.7 % of java submissions (50.3 MB)
 */

// @lc code=start
class Solution {
    int[] nums;
    public int[] sortArray(int[] nums) {
        this.nums = nums;
        mergeSort(0, nums.length - 1);
        return nums;
    }

    void mergeSort(int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        mergeSort(l, mid);
        mergeSort(mid + 1, r);
        merge(l, mid, r);
    }
    
    void merge(int l, int mid, int r) {
        // System.out.println(l + "|" + mid + "|" + r);
        int[] aux = new int[r - l + 1];
        for(int i = l; i <= r; i++) aux[i - l] = nums[i];
        // System.out.println(Arrays.toString(aux));

        int i = l, j = mid + 1;
        for(int k = l; k <= r; k++) {
            if (i > mid) { // 左指针跑完了
                nums[k] = aux[j - l];
                j++;
            } else if (j > r) { // 右指针跑完了
                nums[k] = aux[i - l];
                i++;
            } else if (aux[i - l] < aux[j - l]) { // 左右指针谁值小
                nums[k] = aux[i - l];
                i++;
            } else {
                nums[k] = aux[j - l];
                j++;
            }
        }
    }
}
// @lc code=end

