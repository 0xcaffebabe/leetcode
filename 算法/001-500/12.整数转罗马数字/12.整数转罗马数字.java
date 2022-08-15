/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 * 
 * 3999/3999 cases passed (5 ms)
 * Your runtime beats 21.28 % of java submissions
 * Your memory usage beats 12.87 % of java submissions (41.6 MB)
 */

// @lc code=start
class Solution {
    static Map<Integer,String> map = new HashMap<>();
    static List<Integer> list = List.of(1000,900,500,400,100,90,50,40,10,9,5,4,1);
    static {
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
    }
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            for(int i : list) {
                if (num >= i) {
                    sb.append(map.get(i));
                    num -= i;
                    break;
                }
            }
        }
        return sb.toString();
    }
}
// @lc code=end

