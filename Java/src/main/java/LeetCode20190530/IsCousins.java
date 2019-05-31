package LeetCode20190530;

import src.main.java.NecessaryClass.TreeNode;

import javax.xml.soap.Node;

/**
 * @author: WuLiBin
 * @date: 2019\5\30 0030
 * @description:
 * In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
 *
 * Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
 *
 * We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
 *
 * Return true if and only if the nodes corresponding to the values x and y are cousins.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * Example 2:
 *
 *
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 * Example 3:
 *
 *
 *
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 */
public class IsCousins {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null){
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append(",");
        NodeDepth(root,sb);
        String[] strings = sb.substring(0, sb.length() - 1).split(",");
        int index1 = 0,index2 = 0,index11 = 0,index22 = 0;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(String.valueOf(x))){
                index1 = i;
            }
            if(strings[i].equals(String.valueOf(y))){
                index2 = i;
            }
        }
        for (int i = 1,j = 1; i < strings.length; i *= 2,j++) {
            if(index1 >= i && index1 <= (i * 2)){
                index11 = j;
            }
            if(index2 == i){
                index22 = j;
            }
        }
        return index11 == index22;
    }


    public void NodeDepth(TreeNode node,StringBuilder sb){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            return;
        }
        if(node.left != null){
            sb.append(node.left.val);
            sb.append(",");
        }else{
            sb.append("null,");
        }
        if(node.right != null){
            sb.append(node.right.val);
            sb.append(",");
        }else{
            sb.append("null,");
        }
        if(node.left != null) {
            NodeDepth(node.left, sb);
        }
        if(node.right != null) {
            NodeDepth(node.right, sb);
        }
    }
}
