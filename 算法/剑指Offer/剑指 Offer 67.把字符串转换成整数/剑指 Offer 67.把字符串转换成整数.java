/*
 * @lc app=leetcode.cn id=剑指 Offer 67 lang=java
 * @lcpr version=21908
 *
 * [剑指 Offer 67] 把字符串转换成整数
 * 
 * 1080/1080 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 87.84 % of java submissions (40.4 MB)
 */

// @lc code=start
class Solution {
    public int strToInt(String s) {
        s = s.trim();
        Boolean negative = false;
        
        List<Integer> val = new ArrayList<>();
        for(int index = 0; index < s.length(); index ++) {
            var i = s.charAt(index);
            if (i == '.' && index == 0) return 0;
            if (i == '.' && val.size() != 0) break;

            if (i == '-' && index == 0) {
                negative = true;
                continue;
            }
            else if (i == '+' && index == 0) {
                negative = false;
                continue;
            }
            else if (i == '-' || i == '+') break;

            // 字母起头
            if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
                if(val.size() == 0) return 0;
                break;
            }
            
            if (i >= '0' && i <= '9') val.add(i - '0');
            else break;
        }
        long ans = 0;
        for(int i = 0; i < val.size(); i++) {
            var t = (long)(val.get(i) * Math.pow(10, val.size() - 1 - i));
            if (t > Integer.MAX_VALUE) {
                if (negative) return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            ans  = ans + t;
        }
        if (negative != null && negative) ans = -ans;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) ans;
    }
}
// @lc code=end



/*

// @lcpr case=start
//" "\n
"   +0.123"\n
"   +0 123"\n
"w10734368512"\n
"+ 0 123"\n
"-42"\n
"--42"\n
"w42"\n
"+42"\n
"-4-2"\n
" + 413"\n
"+-12"\n
"+"\n
"-"\n
"18446744073709551617"\n
"-91283472332" \n
"-2147483647" \n
"  -0012a42"\n
// @lcpr case=end

// @lcpr case=start
// "42"\n
// @lcpr case=end

// @lcpr case=start
// "   -42"\n
// @lcpr case=end

// @lcpr case=start
// "4193 with words"\n
// @lcpr case=end

// @lcpr case=start
// "with words 4193"\n
// @lcpr case=end

// @lcpr case=start
// "-48123"\n
// @lcpr case=end

// @lcpr case=start
// "--48123"\n
// @lcpr case=end

// @lcpr case=start
// "+-4193959"\n
// @lcpr case=end

// @lcpr case=start
// "-+4193959"\n
// @lcpr case=end

// @lcpr case=start
// ".41959"\n
// @lcpr case=end

// @lcpr case=start
// "42.484848"\n
// @lcpr case=end

// @lcpr case=start
// "00000-42a1234"\n
// @lcpr case=end

// @lcpr case=start
// "21474836460"\n
// @lcpr case=end

// @lcpr case=start
// "+-12"\n
// @lcpr case=end

// @lcpr case=start
//"0000000-12345"\n
// @lcpr case=end


 */