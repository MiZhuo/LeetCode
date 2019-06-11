package src.main.java.LeetCode_2019_06.LeetCode20190611;

import src.main.java.NecessaryClass.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: WuLiBin
 * @date: 2019\6\11 0011
 * @description:
 * 给定一个二叉树，在树的最后一行找到最左边的值。
 *
 * 示例 1:
 *
 * 输入:
 *
 *     2
 *    / \
 *   1   3
 *
 * 输出:
 * 1
 *  
 *
 * 示例 2:
 *
 * 输入:
 *
 *         1
 *        / \
 *       2   3
 *      /   / \
 *     4   5   6
 *        /
 *       7
 *
 * 输出:
 * 7
 */
public class FindBottomLeftValue {
    private Map<Integer,Integer> map = new HashMap<>();
    public int findBottomLeftValue(TreeNode root) {
        findNode(root,0);
        int temp = 0;
        int value = 0;
        for(int i : map.keySet()){
            if(map.get(i) > temp || temp == 0){
                temp = map.get(i);
                value = i;
            }
        }
        return value;
    }

    public void findNode(TreeNode root,int i){
        if(root == null){
            return;
        }
        if(root.left == null){
            map.put(root.val,i);
        }
        findNode(root.left,i + 1);
        findNode(root.right,i + 1);
    }
}
