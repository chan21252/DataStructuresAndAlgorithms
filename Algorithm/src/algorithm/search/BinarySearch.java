package algorithm.search;

/**
 * 二分法查找
 *
 * @author Chan
 * @since 2020-03-09
 */
public class BinarySearch {
    /**
     * 从一个有序数组中找到目标元素的索引
     * @param key 目标元素
     * @param a 有序数组
     * @return int，不存在返回-1
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return  -1;

    }
}
