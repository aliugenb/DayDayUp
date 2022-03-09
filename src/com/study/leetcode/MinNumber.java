package com.study.leetcode;

import java.util.*;

/*
输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class MinNumber {
    public static String min(int[] nums) {
        String res = "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));

        StringBuffer sb = new StringBuffer();
        for(String s:strs){
            sb.append(s);
        }
        res = sb.toString();
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {20, 1};
        min(nums);

    }
}
