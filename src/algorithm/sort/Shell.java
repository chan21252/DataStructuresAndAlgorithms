package algorithm.sort;

/**
 * 希尔排序
 * 思路
 * 1. 希尔排序是对插入排序的改进版本，核心是“缩小增量”
 * 2. 构建增量序列，把数组元素按增量进行分组，对每个分组使用插入排序；
 * 3. 增量逐渐减小，直到1
 * <p>
 * 算法步骤：
 * 1. 数组长度为n，下标从0开始
 * 2. 增量序列h为，3*k + 1（k=1,2,3...），max(h)<n/3
 * 3. 对于增量h，当前要插入的元素a[j]：
 * a. 前a[j%h]...a[j-2h]，a[j-h]是有序的
 * b. 将a[j]和a[j-h]，a[j-2h]...比较，找到合适的位置插入（i每次递减h，直到j<h）
 *
 * @author Chan
 * @since 2020/3/9
 */
public class Shell {

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
     * 希尔排序
     *
     * @param a 数组
     */
    public static void sort(Comparable[] a) {
        int h = 1;
        int n = a.length;

        while (h < n / 3) {
            h = 3 * h + 1;
        }

        for (int i = h; i < n; i++) {
            for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                exch(a, j, j - h);
            }
        }
    }
}
