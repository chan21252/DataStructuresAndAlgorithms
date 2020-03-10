package test.sort;

import algorithm.sort.Shell;
import edu.princeton.cs.algs4.StdRandom;

/**
 * SelectionTest
 *
 * @author Chan
 * @since 2020/3/9
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = new Integer[16];

        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(0, 10000);
        }

        Shell.sort(a);
        Shell.show(a);
    }
}