package com.study.leetcode;

/**
 * ClassName: LongestCommonPrefix
 * Author: ye.liu
 * Date: 2022/3/10 14:02
 * Description:
 */

/*
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。
 */

public class LongestCommonPrefix {
    public static String commonPrefix(String[] strings) {
        String res = "";

        if (strings.length == 0) {
            return res;
        }
        int min = strings[0].length();
        for (String s : strings) {
            min = Math.min(min, s.length());
        }
        System.out.println(min);
        for (int i = 0; i < min; i++) {
            boolean flag = false;
            for (int j = 0; j < strings.length; j++) {
                if (strings[0].charAt(i) == strings[j].charAt(i)) {
                    flag = true;
                } else {
                    flag = false;
                    return res;
                }
            }
            if (flag) {
                res = res + strings[0].charAt(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        String[] s = {"abcdd", "abcccd", "abddddd"};
        String[] s = {"cir","car"};
        System.out.println(commonPrefix(s));
    }
}
