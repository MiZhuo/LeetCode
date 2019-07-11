package LeetCode_2019_07.LeetCode20190709;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by wulibin on 2019/7/9
 * 
 *给定一个从1 到 n 排序的整数列表。
 *首先，从左到右，从第一个数字开始，每隔一个数字进行删除，直到列表的末尾。
 *第二步，在剩下的数字中，从右到左，从倒数第一个数字开始，每隔一个数字进行删除，直到列表开头。
 *我们不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。
 *返回长度为 n 的列表中，最后剩下的数字。
 *
 *示例：
 *
 *输入:
 *n = 9,
 *1 2 3 4 5 6 7 8 9
 *2 4 6 8
 *2 6
 *6
 *
 *输出:
 *6
 *
 *来源：力扣（LeetCode）
 *链接：https://leetcode-cn.com/problems/elimination-game
 *著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *  
 *
 * 
*
 * @author Administrator*/
public class LastRemaining{
	public int lastRemaining(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1;i <= n;i++){
			list.add(i);
		}
        int iFlag = -1;
        while(list.size() != 1){
        	if(iFlag != 0){
		        for(int i = 0;i < (list.size() % 2 == 0 ? list.size() / 2 + 1 : list.size() / 2 );i++){
		        	list.remove(i);
		        }
		        iFlag = 0;
		    }else{
		    	for(int i = list.size() - 1;i < (list.size() % 2 == 0 ? list.size() / 2 : list.size() / 2 + 1) ;i--){
		    		list.remove(i);
		    	}
		    	iFlag = list.size();
		    }
	    }
	    return list.get(0);
    }
}
