package src.main.java.LeetCode20190527;

/**
 * @author: WuLiBin
 * @date: 2019\5\27 0027
 * @description:
 */
public class ScoreOfParentheses {
    /**执行用时 : 1 ms, 在Score of Parentheses的Java提交中击败了100.00% 的用户
    内存消耗 : 33.7 MB, 在Score of Parentheses的Java提交中击败了90.91% 的用户*/
    public int scoreOfParentheses(String S) {
        int leftCount = 0,rightCount = 0,sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '('){
                leftCount ++;
            }else{
                rightCount++;
                if((i + 1) >= S.length() || S.charAt(i + 1) == '('){
                    sum += (1 << (leftCount - 1));
                    leftCount -= rightCount;
                    rightCount = 0;
                }
            }
        }
        return sum;
    }
}

