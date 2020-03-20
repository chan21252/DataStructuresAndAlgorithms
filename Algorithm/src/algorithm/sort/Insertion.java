package algorithm.sort;

/**
 * 插入排序
 *
 * @author Chan
 * @since 2020/3/9
 */
public class Insertion {

    /**
     * 比较两个元素的大小
     *
     * @param v Comparable
     * @param w Comparable
     * @return
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换a[i]和a[j]的值
     *
     * @param a 数组
     * @param i int
     * @param j int
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 打印a[]所有的元素
     *
     * @param a
     */
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    /**
     * 思路：
     * 1. 将数组分成2部分，已排序的和未排序的
     * 2. 将一个待排序的元素插入到已经排好序的元素中，直到全部插入完位置
     * <p>
     * 算法步骤：
     * 1. 数组长度为n，下标从0开始
     * 2. 第i个元素排序时
     * a. a[0]...a[i-1]是有序的
     * b. 将a[i]和a[i-1]...a[0]进行比较，找到合适的位置插入
     *
     * @param a 数组
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }
}