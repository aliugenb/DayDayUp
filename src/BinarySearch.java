/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/5/10
 * Time: 23:21
 * 二分
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 3, 46, 78, 90, 115, 666, 777, 999};
        int b = recursionBinarySearch(a, 115, 0, a.length - 1);
        System.out.println(b);
    }

    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {

        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        //初始中间位置
        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }
}
