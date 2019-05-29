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
        for (String log : logs) {
            boolean isNum = true;
            for (int i = log.indexOf(' '); i < log.length(); i++) {
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
        int size = letters.size();
        letters.addAll(digits);
        String[] arr = new String[letters.size()];
        letters.toArray(arr);
        return LogSort(arr,size);
    }

    /**
     * 对字母日志进行排序
     * @param arr
     * @param size
     * @return
     */
    private String[] LogSort(String[] arr,int size) {
        for (int i = 0; i < size - 1; i++) {
            for(int j = arr[i].indexOf(' ') + 1, k = arr[i + 1].indexOf(' ') + 1; j < arr[i].length() && k < arr[i + 1].length();j++,k++){
                if(arr[i].charAt(j) > arr[i + 1].charAt(k)){
                    String temp = "";
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    break;
                }else if (arr[i].charAt(j) == arr[i + 1].charAt(k)){
                    continue;
                }else{
                    break;
                }
            }

        }
        return arr;
    }
}
