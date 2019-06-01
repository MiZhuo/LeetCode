package src.main.java.LeetCode20190514;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wulibin
 * @date: 2019\5\14 0014
 * @description:
 * There is a list of sorted integers from 1 to n. Starting from left to right, remove the first number and every other number afterward until you reach the end of the list.
 *
 * Repeat the previous step again, but this time from right to left, remove the right most number and every other number from the remaining numbers.
 *
 * We keep repeating the steps again, alternating left to right and right to left, until a single number remains.
 *
 * Find the last number that remains starting with a list of length n.
 *
 * Example:
 *
 * Input:
 * n = 9,
 * 1 2 3 4 5 6 7 8 9
 * 2 4 6 8
 * 2 6
 * 6
 *
 * Output:
 * 6
 */
public class LastRemaining {
    //解法1 效率太低
    public int lastRemaining(int n) {
        //return n == 1 ? 1 : 2 * (n / 2 + 1 - lastRemaining(n / 2));
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while(i <= n){
            list.add(i);
            i++;
        }
        if(list.size() > 1) {
            return remove(list, 1);
        }else if(list.size() == 1){
            return list.get(0);
        }else{
            return -1;
        }
    }

    public int remove(List<Integer> list,int iLoop){
        if(iLoop % 2 == 0){
            for(int i = list.size() - 1;i > -1;i -= 2){
                list.remove(i);
            }
        }else{
            for(int i = 0;i < list.size();i ++){
                list.remove(i);
            }
        }
        iLoop ++;
        if(list.size() > 1){
            return remove(list,iLoop);
        }
        return list.get(0);
    }
}
