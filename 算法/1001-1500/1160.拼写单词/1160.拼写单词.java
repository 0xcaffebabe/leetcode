/*
 * @lc app=leetcode.cn id=1160 lang=java
 * @lcpr version=
 *
 * [1160] 拼写单词
 * 
 * 36/36 cases passed (7 ms)
 * Your runtime beats 69.7 % of java submissions
 * Your memory usage beats 77.51 % of java submissions (42.9 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] m = new int[26];
        for(var c: chars.toCharArray()) m[c - 'a']++;
        int ans = 0;
        for(var s: words) {
            int[] n = new int[26];
            for(var c: s.toCharArray()) n[c - 'a']++;
            boolean matched = true;
            for(int i = 0; i < 26; i++) {
                if (n[i] > m[i]) matched = false;
            }
            if (matched) ans += s.length();
        }
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["cat","bt","hat","tree"]\n"atach"\n
// @lcpr case=end

// @lcpr case=start
// ["hello","world","leetcode"]\n"welldonehoneyr"\n
// ["dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin","ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb","ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl","boygirdlggnh","xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx","nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop","hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx","juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr","lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo","oxgaskztzroxuntiwlfyufddl","tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"]\n"usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"\n
// @lcpr case=end

 */

