package LeetCode_2019_06.LeetCode20190615;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by wulibin on 2019/6/15
 *给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 */

/**
 * 执行用时 :1 ms, 在所有Java提交中击败了98.65%的用户
 * 内存消耗 :33.5 MB, 在所有Java提交中击败了46.85%的用户
 */
public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < numRows;i++){
            List<Integer> inline = new ArrayList<>();
            if(i == 0){
                inline.add(1);
                result.add(inline);
                continue;
            }
            inline.add(1);
            List<Integer> lastList = result.get(i - 1);
            for(int j = 0; j < lastList.size() - 1;j++){
                inline.add(lastList.get(j) + lastList.get(j + 1));
            }
            inline.add(1);
            result.add(inline);
        }
        return result;
    }
}
