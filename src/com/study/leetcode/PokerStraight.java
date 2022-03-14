package com.study.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ClassName: PokerStraight
 * Author: ye.liu
 * Date: 2022/3/14 12:26
 * Description:
 */
/*
从若干副扑克牌中随机抽 5 张牌，判断是不是一个顺子，
即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 */

public class PokerStraight {
    public static boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<Integer>();
        int max = 0, min = 14;
        for (int num : nums) {
            if (num == 0) {
                continue;
            }
            max = Math.max(max, num);
            min = Math.min(min, num);
            repeat.add(num);
        }
        if (repeat.size() < 5) {
            return false;
        }
        return max - min < 5;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 4, 5};
        System.out.println(isStraight(nums));
    }
}
