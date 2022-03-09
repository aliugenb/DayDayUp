package com.study.leetcode;

/*
给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。

由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么num的前 k 个元素应该保存最终结果。

将最终结果插入nums 的前 k 个位置后返回 k 。

不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */

public class RemoveDuplicatesNum {
    public static int remove(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return n;
        }
        int a = 1, b = 1;
        while (a < n) {
            if (nums[a] != nums[a - 1]) {
                nums[b] = nums[b];
                ++b;
            }
            ++a;
        }
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        remove(nums);
//        System.out.println(remove(nums));
    }
}
