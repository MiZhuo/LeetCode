package LeetCode_2019_08.LeetCode20190802;

import java.util.Arrays;

/**
 * Create by wulibin on 2019/8/2
 * 几乎每一个人都用 乘法表。但是你能在乘法表中快速找到第k小的数字吗？
 *
 * 给定高度m 、宽度n 的一张 m * n的乘法表，以及正整数k，你需要返回表中第k 小的数字。
 *
 * 例 1：
 *
 * 输入: m = 3, n = 3, k = 5
 * 输出: 3
 * 解释:
 * 乘法表:
 * 1	2	3
 * 2	4	6
 * 3	6	9
 *
 * 第5小的数字是 3 (1, 2, 2, 3, 3).
 * 例 2：
 *
 * 输入: m = 2, n = 3, k = 6
 * 输出: 6
 * 解释:
 * 乘法表:
 * 1	2	3
 * 2	4	6
 *
 * 第6小的数字是 6 (1, 2, 2, 3, 4, 6).
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kth-smallest-number-in-multiplication-table
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindKthNumber {
    public int findKthNumber(int m, int n, int k) {
        if(k > m * n){
            return -1;
        }
        int[] res = new int[m * n];
        int iLoop = 0;
        for (int i = 1; i <= m; i++) {
            for (int i1 = 1; i1 <= n; i1++) {
                res[iLoop++] = i * i1;
            }
        }
        Arrays.sort(res);
        return res[k - 1];
    }
}
