package com.study.leetcode;

import java.util.*;

/*
给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出和为目标值
target 的那两个整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 */

public class TwoNumSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> tempNums = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            tempNums.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempNums.containsKey(target - nums[i]) && tempNums.get(target - nums[i]) != i) {
                result[0] = i;
                result[1] = tempNums.get(target - nums[i]);
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        for (int i : twoSum(nums, target)) {
            System.out.println(i);
        }
    }
}
