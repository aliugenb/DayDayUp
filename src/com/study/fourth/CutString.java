package com.study.fourth;

import java.io.UnsupportedEncodingException;

/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/5/30
 * Time: 20:49
 * 按照字节截取
 */
public class CutString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String aa = "中d国abc";
        String[] bb = aa.split("");
        int begin = 1;
        int end = 3;
        int realBegin = 0;
        int realEnd = 0;
        int strLength = 0;
        for(int i=0;i<bb.length;i++){
            strLength += bb[i].getBytes("GBK").length;
            System.out.println(strLength);
            System.out.println("---");
            if (strLength==begin){
                if(bb[i].getBytes().length==1){
                    realBegin=i;
                } else {
                    realBegin = i+1;
                }
            }else if(strLength-begin==1){
                if(bb[i].getBytes().length==1){
                    realBegin=i+1;
                } else {
                    realBegin = i;
                }
            }
            if (strLength==end){
                if(bb[i].getBytes().length==1){
                    realEnd=i;
                } else {
                    realEnd = i+1;
                }
            } else if (strLength-end==1){
                if(bb[i].getBytes().length==1){
                    realEnd=i;
                } else {
                    realEnd = i+1;
                }
            }
        }
        System.out.println(realBegin);
        System.out.println(realEnd);
        System.out.println(aa.substring(realBegin,realEnd));
    }
}
