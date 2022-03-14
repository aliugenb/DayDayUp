package com.study.leetcode;

/**
 * ClassName: MirrorBinaryTree
 * Author: ye.liu
 * Date: 2022/3/14 22:27
 * Description:
 */
/*
请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 */

public class MirrorBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
