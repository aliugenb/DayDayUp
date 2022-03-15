/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/5/10
 * Time: 22:46
 * 冒泡排序
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 4, 5, 6, 11, 3, 43, 45, 87};
        for (int num : arr) {
            System.out.println(num + "");
        }
        //外层循环控制排序趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制每一趟排序多少次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(num + ",");
        }
    }
}
