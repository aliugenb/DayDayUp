package com.study.leetcode;


import java.util.*;

/**
 * ClassName: MaxDepth
 * Author: ye.liu
 * Date: 2022/3/14 19:35
 * Description:
 */
/*
输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
例如：给定二叉树 [3,9,20,null,null,15,7]
 */

public class MaxDepth {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int bfsMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = bfsMaxDepth(root.left) + 1;
        int rightDepth = bfsMaxDepth(root.right) + 1;
        return Math.max(leftDepth, rightDepth);
    }

    public static int dfsMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                level.add(node.val);
            }
            res.add(level);
        }
        return res.size();
    }

    public static void main(String[] args) {

    }
}
