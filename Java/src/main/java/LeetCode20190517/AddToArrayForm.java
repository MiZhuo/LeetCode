package src.main.java.LeetCode20190517;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: WuLiBin
 * @date: 2019\5\17 0017
 * @description:
 * For a non-negative integer X, the array-form of X is an array of its digits in left to right order.  For example, if X = 1231, then the array form is [1,2,3,1].
 *
 * Given the array-form A of a non-negative integer X, return the array-form of the integer X+K.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1,2,0,0], K = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 * Example 2:
 *
 * Input: A = [2,7,4], K = 181
 * Output: [4,5,5]
 * Explanation: 274 + 181 = 455
 * Example 3:
 *
 * Input: A = [2,1,5], K = 806
 * Output: [1,0,2,1]
 * Explanation: 215 + 806 = 1021
 * Example 4:
 *
 * Input: A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * Output: [1,0,0,0,0,0,0,0,0,0,0]
 * Explanation: 9999999999 + 1 = 10000000000
 */
public class AddToArrayForm {
    public List<Integer> addToArrayForm(int[] A, int K) {
        int i = 1;
        while(K > 0){
            A[A.length - i] += K % 10;
            K = K / 10;
            i ++;
            int j = 0;
            while(A[A.length - 1 - j] >= 10){
                A[A.length - 1 - j] = A[A.length - 1 - j] % 10;
                A[A.length - 2 - j] += 1;
                j ++;
            }
        }

        List<Integer> list = new ArrayList<Integer>();
        for(int a : A){
            list.add(a);
        }
        return list;
    }
    //当数组过长会导致转为整型越界，所以本方法不可取
    public List<Integer> addToArrayForm2(int[] A, int K) {
        long num = A[0];
        for(int i = 1; i < A.length;i++){
            num = num * 10 + A[i];
        }
        char[] chars = String.valueOf(num + K).toCharArray();
        List<Integer> list = new ArrayList<>();
        for(char c : chars){
            list.add(Integer.valueOf(String.valueOf(c)));
        }
        return list;
    }
}
