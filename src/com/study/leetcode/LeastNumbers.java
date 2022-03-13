package com.study.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * ClassName: LeastNumbers
 * Author: ye.liu
 * Date: 2022/3/12 23:29
 * Description:
 */
/*
输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */

public class LeastNumbers {
    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        if (k == 0) {
            return res;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((num1, num2) -> num2.compareTo(num1));
        for (int i = 0; i < k; ++i) {
            queue.offer(arr[i]);
        }
        System.out.println(queue);

        for (int i = k; i < arr.length; ++i) {
            if (queue.peek() > arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; ++i) {
            res[i] = queue.poll();
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {7,4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(getLeastNumbers(nums, 5));
    }
}
