package com.study.fourth;

/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/5/29
 * Time: 22:45
 * 九九乘法表
 */
public class NineNine {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                int a= i*j;
                System.out.print(i+"*"+j+"="+a+"\t");
            }
            System.out.println();
        }
    }
}
