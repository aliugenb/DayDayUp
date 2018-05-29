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
        create(10);
        double a = (double)9/2;
        System.out.println(a);
        System.out.println(Math.ceil(a));
    }

    public static void create(int highet) {
        String[] arr = new String[2*highet-1];
        for(int a=0;a<arr.length;a++){
            arr[a]="";
        }
        for(int i=1;i<=highet;i++){
            for(int j=highet-1;j>=0;j--){
                arr[j]
            }
            arr[highet]="*";

            System.out.println();
        }
    }
}
