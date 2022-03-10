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
        if (strings.length == 0 || strings.length == 1) {
            return "";
        }
        int min = strings[0].length();
        for (String s : strings) {
            min = Math.min(min, s.length());
        }

        for (int i = 0; i < min; i++) {
            for (String s : strings) {
                if (strings[min].charAt(i)==)
            }
        }
    }
}
