package com.study.leetcode;

/**
 * ClassName: ReverseWords
 * Author: ye.liu
 * Date: 2022/3/14 23:22
 * Description:
 */
/*
输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。
例如输入字符串"I am a student. "，则输出"student. a am I"。
 */

public class ReverseWords {
    public static String reverseWords(String s) {
        s = s.trim();
        StringBuffer res = new StringBuffer();
        int i = s.length() - 1, j = i;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            res.append(s.substring(i + 1, j + 1) + " ");
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            j = i;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "the sky";
        System.out.println(reverseWords(s).length());
    }
}
