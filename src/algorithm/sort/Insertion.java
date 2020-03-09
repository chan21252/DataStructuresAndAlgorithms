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
     * 插入排序
     * 假设第一个元素已经排好序
     * 从第二个元素开始，提前当前元素
     * 将当前元素和已排好序的元素依次对比，如果小于就交换，否则就插入该元素，结束对比
     *
     * @param a 数组
     */
    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; (j > 0) && less(a[j], a[j - 1]); j--) {
                exch(a, i, j - 1);
            }
        }
    }
}
