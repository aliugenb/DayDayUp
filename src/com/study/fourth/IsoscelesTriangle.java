package com.study.fourth;

/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/5/29
 * Time: 23:01
 * 等腰三角形
 */
public class IsoscelesTriangle {
    public static void main(String[] args) {
        int height = 15;
        for (int a = 0; a < height; a++) {
            for (int b = height; b >= 0; b--) {
                if (b > a) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
