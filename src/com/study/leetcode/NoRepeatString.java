package com.study.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */

public class NoRepeatString {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, result = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            result = Math.max(result, rk - i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcdefgcf";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
