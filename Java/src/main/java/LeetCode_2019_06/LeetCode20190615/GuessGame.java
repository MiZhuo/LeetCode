package LeetCode_2019_06.LeetCode20190615;

/**
 * Create by wulibin on 2019/6/15
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * 示例 :
 *
 * 输入: n = 10, pick = 6
 * 输出: 6
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/guess-number-higher-or-lower
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * The guess API is defined in the parent class GuessGame.
 *    @param //num, your guess
 *    @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
 *       int guess(int num);
 */

/**
 * 执行用时 :1 ms, 在所有Java提交中击败了99.31%的用户
 * 内存消耗 :32.4 MB,在所有Java提交中击败了80.90%的用户
 */
public class GuessGame {

    private int RandomNumber = 0;

    public void setRandomNumber(int i) {
        this.RandomNumber = i;
    }

    private int guess(int num){
        if(RandomNumber > num){
            return 1;
        }else if(RandomNumber < num){
            return -1;
        }else{
            return 0;
        }
    }
    public int guessNumber(int n) {
        int begin = 1,end = n;
        if(guess(begin) == 0){
            return begin;
        }
        if(guess(end) == 0){
            return end;
        }
        while(begin!=end){
            int temp = begin + (end - begin) / 2;
            int res = guess(temp);
            if(res == 0){
                return temp;
            }else if(res < 0){
                end = temp;
            }else{
                begin = temp;
            }
        }
        return begin;
    }
}
