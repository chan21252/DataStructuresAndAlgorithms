package algorithm.analysis;

import algorithm.search.BinarySearch;

import java.util.Arrays;

/**
 * TwoSumFast
 *
 * @author Chan
 * @since 2020/3/9
 */
public class TwoSumFast {

    public static int count(int[] a) {
        Arrays.sort(a);

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            //从a中找a[i]的相反数，防止重复，只保存大于i的结果
            if (BinarySearch.rank(-a[i], a) > i) {
                count++;
            }
        }

        return count;
    }
}
