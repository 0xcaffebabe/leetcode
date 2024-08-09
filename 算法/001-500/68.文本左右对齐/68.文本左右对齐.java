/*
 * @lc app=leetcode.cn id=68 lang=java
 * @lcpr version=
 *
 * [68] 文本左右对齐
 * 
 * 29/29 cases passed (1 ms)
 * Your runtime beats 64.42 % of java submissions
 * Your memory usage beats 68.07 % of java submissions (40.8 MB)
 */


// @lcpr-template-start

// @lcpr-template-end
// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    int nextWord = 0;
    int maxWidth = 0;
    String[] words;
    List<List<String>> segements = new ArrayList<>();
    
    public List<String> fullJustify(String[] words, int maxWidth) {
        this.words = words;
        this.maxWidth = maxWidth;
        // 第一轮，计算每行由哪些单词组成
            // 1. 最大单词组成的文本长度 = N个单词 + N-1 个空格 == maxWidth
                // 当只有一个单词时，文本长度 = 1个单词 + N个空格
        splitSegements();
        // 第二轮，分配空格
            // 1. 平均空格数 = (maxWidth - 所有单词组成的文本长度) / min(单词数-1, 1)
            // 2. 余下的空格从第一个空格累加.
            // 3. 如果是最后一行，则余下的空格应该都加到最后一个空格
            // 4. 如果只有一个单词，则都加到最后
        
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < segements.size(); i++)
            ans.add(assignSpaces(i));
        // System.out.println(ans);
        return ans;
    }

    String assignSpaces(int index) {
        int wordCount = segements.get(index).size();
        int wordTextLength = 0;
        for(var i : segements.get(index)) 
            wordTextLength += i.length();
        int avgSpaces = (maxWidth - wordTextLength) / Math.max(wordCount - 1, 1);
        int remainSapces = 0;
        if (wordCount != 1) 
            remainSapces = maxWidth - (avgSpaces * (wordCount-1)) - wordTextLength;
        int[] spaces = new int[Math.max(wordCount - 1, 1)];
        for(int i = 0; i < spaces.length; i++)
            spaces[i] = avgSpaces;
        for(int i = 0; i < spaces.length; i++) {
            if (remainSapces == 0) break;
            spaces[i] ++;
            remainSapces--;
        }

        if (wordCount == 1) {
            spaces[0] = maxWidth - wordTextLength;
        }
        boolean isLast = index == segements.size() - 1;
        if (isLast && wordCount != 1) {
            int totalSpaces = maxWidth - wordTextLength;
            spaces = new int[wordCount];
            for(int i = 0; i < spaces.length; i++) {
                if (totalSpaces == 0) break;
                spaces[i]++;
                totalSpaces--;
            }
            if (totalSpaces > 0) spaces[spaces.length - 1] += totalSpaces;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < segements.get(index).size(); i++) {
            sb.append(segements.get(index).get(i));
            if (i != segements.get(index).size() - 1 || (isLast && wordCount != 1) ) {
                for(int j = 0; j < spaces[i]; j++)
                    sb.append(" ");
            }
        }
        if (wordCount == 1) {
            for(int i = 0; i < spaces[0]; i++)
                sb.append(" ");
        }
         
        return sb.toString();        
    }

    void splitSegements() {
        List<String> list;
        while((list = split()).size() != 0) 
            segements.add(list);
    }

    List<String> split() {
        int wordsTextLength = 0;
        List<String> ans = new ArrayList<>();
        for(int i = nextWord; i < words.length; i++) {
            int spaceLength = ans.size() - 1;
            if (spaceLength == -1) spaceLength = 0;
            if (wordsTextLength + spaceLength + words[i].length() > maxWidth)
                break;
            wordsTextLength += words[i].length();
            ans.add(words[i]);
            nextWord++;
        }
        // 检查是否超过最大限制
        if (wordsTextLength + ans.size() - 1 > maxWidth) {
            ans.remove(ans.size() - 1);
            nextWord--;
        }
        // System.out.println(ans);
        
        return ans;
    }
}
// @lc code=end



/*
// @lcpr case=start
// ["This", "is", "an", "example", "of", "text", "justification."]\n16\n
// ["Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"]\n20\n
// ["What","must","be","acknowledgment","shall","be"]\n16\n
// ["a"]\n16\n
// ["a","n"]\n16\n
// @lcpr case=end

// @lcpr case=start

// @lcpr case=end

// @lcpr case=start

// @lcpr case=end

 */

