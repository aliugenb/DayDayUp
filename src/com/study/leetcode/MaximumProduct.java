package com.study.leetcode;

import java.util.Arrays;

/**
 * ClassName: MaximumProduct
 * Author: ye.liu
 * Date: 2022/4/12 22:11
 * Description:
 */
/*
给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积
 */

public class MaximumProduct {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1], nums[n - 3] * nums[n - 2] * nums[n - 1]);
    }

    public static void main(String[] args) {
        int[] nums = {-5,-4,-3,1,2,3};
        System.out.println(maximumProduct(nums));
    }
}
