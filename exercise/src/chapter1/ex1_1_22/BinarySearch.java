package chapter1.ex1_1_22;

/**
 * BinarySearch
 *
 * @author Chan
 * @since 2020/3/12
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(rank(10, a));
    }

    /**
     * 二分法查找
     *
     * @param key  key
     * @param a    有序数组
     * @param lo   开始下标
     * @param hi   结束下标
     * @param deep 递归深度
     * @return 下标
     */
    private static int rank(int key, int[] a, int lo, int hi, int deep) {
        deep++;
        for (int i = 0; i < deep; i++) {
            System.out.print(" ");
        }
        System.out.println(lo + " ~ " + hi);

        int mid = lo + (hi - lo) / 2;
        if (hi < lo) {
            return -1;
        }

        if (key < a[mid]) {
            hi = mid - 1;
        } else if (key > a[mid]) {
            lo = mid + 1;
        } else {
            return mid;
        }

        return rank(key, a, lo, hi, deep);
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        return rank(key, a, lo, hi, 0);
    }
}
