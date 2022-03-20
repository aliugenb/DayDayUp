/**
 * Created with IntelliJ IDEA.
 * Author: ye.liu
 * Date: 2018/5/10
 * Time: 22:46
 * 快速排序
 */

public class QuickSort {
    public static void sort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    private static void sort(int[] a, int lo, int hi) {
        //递归退出判断条件
        if (lo >= hi) {
            return;
        }
        //对于某一元素，其本身不必参与递归了，因为其所在的位置已经满足前面的不大于，后面的不小于
        int p = partition(a, lo, hi);
        sort(a, lo, p - 1);
        sort(a, p + 1, hi);
    }

    private static int partition(int[] a, int lo, int hi) {
        //左pointer，供扫描用
        int left = lo;
        //右pointer，供扫描用，加1是为了方便扫描的推进，
        int right = hi + 1;
        int pivot = a[lo];

        while (true) {
            //从lo开始，找到大于pivot的元素，在访问数组时使用前++更安全，后++可能会发生越界
            while (a[++left] <= pivot) {
                if (left == hi) {
                    break;
                }
            }
            //从hi开始，找到小于pivot的元素
            while (a[--right] >= pivot) {
                if (right == lo) {
                    break;
                }
            }
            //左右扫描相交，迭代结束判断条件，相等的时候说明就是和pivot相等的元素
            if (left >= right) {
                break;
            }
            swap(a, left, right);
        }
        swap(a, lo, right);
        return right;
    }

    private static void swap(int[] a, int i, int j) {
        //对于待排序数组中无重复元素时，可以使用异或操作来实现，但是如果有重复的，那么就不可以，重复的元素会被置为0
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 1, 9, 3, 2, 1, 6, 8, 4, 7, 5};
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i] + " ");
        }
    }
}