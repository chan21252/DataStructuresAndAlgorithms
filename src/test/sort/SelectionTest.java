package test.sort;

import algorithm.sort.Selection;
import edu.princeton.cs.algs4.StdRandom;

/**
 * SelectionTest
 *
 * @author Chan
 * @since 2020/3/9
 */
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] a = new Integer[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniform(0, 1000);
        }

        Selection.sort(a);
        Selection.show(a);
    }
}