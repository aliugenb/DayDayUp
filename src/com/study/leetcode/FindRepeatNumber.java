package com.study.leetcode;

import java.util.*;

/**
 * ClassName: FindRepeatNum
 * Author: ye.liu
 * Date: 2022/3/11 11:23
 * Description:
 */
/*
在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
请找出数组中任意一个重复的数字。
 */

public class FindRepeatNumber {

    public static int repeatNum(int[] nums) {
        int res = 0;
        Set set = new HashSet();
        for (int num : nums) {
            if (!set.add(num)) {
                res = num;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 35, 5, 6, 32, 2, 1};
        System.out.println(repeatNum(nums));
    }
}
