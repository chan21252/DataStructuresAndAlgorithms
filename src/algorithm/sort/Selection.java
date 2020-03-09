package algorithm.sort;

/**
 * 选择排序
 *
 * @author Chan
 * @since 2020/3/9
 */
public class Selection {

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
     * 选择排序
     * 找出数组中最小的元素，和数组的第一个元素交换
     * 再从剩下的元素中找最小的元素，和第二个元素交换
     * 如此往复...
     *
     * @param a 数组
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        //交换n次
        for (int i = 0; i < n; i++) {
            int min = i;
            //找到最小元素的下标
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            //交换位置
            exch(a, i, min);
        }
    }
}
