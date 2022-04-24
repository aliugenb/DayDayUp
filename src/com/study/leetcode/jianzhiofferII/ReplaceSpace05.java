package com.study.leetcode.jianzhiofferII;

/**
 * ClassName: ReplaceSpace
 * Author: ye.liu
 * Date: 2022/4/24 22:17
 * Description:
 */
/*
剑指 Offer 05. 替换空格
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */

public class ReplaceSpace05 {
    public static String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
