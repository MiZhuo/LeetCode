package src.main.java.LeetCode20190528;

import java.util.*;

/**
 * @author: WuLiBin
 * @date: 2019\5\28 0028
 * @description:
 * You have an array of logs.  Each log is a space delimited string of words.
 *
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 *
 * Each word after the identifier will consist only of lowercase letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.
 *
 * Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.
 *
 * Return the final order of the logs.
 *
 *
 *
 * Example 1:
 *
 * Input: ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
 * Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
 */
public class ReorderLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        List<String> letters = new ArrayList<>();
        List<String> digits = new ArrayList<>();
        boolean isNum = true;
        for (String log : logs) {
            isNum = true;
            for (int i = 1; i < log.length(); i++) {
                if(log.charAt(i) == ' '){
                    continue;
                }
                if((log.charAt(i) > '9' || log.charAt(i) < '0')){
                    isNum = false;
                    break;
                }
            }
            if(!isNum){
                letters.add(log);
            }else{
                digits.add(log);
            }
        }
        Arrays.sort(letters.toArray());
        letters.addAll(digits);
        return (String[]) letters.toArray();
    }
}
