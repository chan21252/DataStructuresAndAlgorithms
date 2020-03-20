package algorithm.sort;

/**
 * 归并排序
 *
 * @author Chan
 * @since 2020/3/11
 */
public class Merge {

    private static Comparable[] aux;

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

    public static boolean isSort(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }

        return true;
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }

        int mid = lo + (hi - lo) / 2;

        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }

    /**
     * 思路：
     *
     * @param a 数组
     */
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    /**
     * 归并2个有序数组
     *
     * @param a   Comparable[]有序数组
     * @param lo  开始
     * @param mid 中间
     * @param hi  末尾
     */
    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        assert isSort(a, lo, mid);
        assert isSort(a, mid + 1, hi);

        int i = lo;
        int j = mid + 1;

        //a复制到辅助数组aux
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }

        //将aux的元素按顺序填回a
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }

        assert isSort(a);
    }
}