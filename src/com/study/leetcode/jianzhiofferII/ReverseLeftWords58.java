package com.study.leetcode.jianzhiofferII;

/**
 * ClassName: ReverseLeftWords58
 * Author: ye.liu
 * Date: 2022/4/19 22:49
 * Description:
 */
/*
剑指 Offer 58 - II. 左旋转字符串
字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 */

public class ReverseLeftWords58 {
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public static String reverseLeftWords2(String s, int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = n; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        for (int j = 0; j < n; j++) {
            sb.append(s.charAt(j));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(reverseLeftWords(s,2));
        System.out.println(reverseLeftWords2(s,2));

    }
}
