package test.sort;

import algorithm.sort.Merge;

/**
 * SelectionTest
 *
 * @author Chan
 * @since 2020/3/9
 */
public class SelectionTest {
    public static void main(String[] args) {
        String[] a = new String[]{"M", "E", "R", "G", "E", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

        Merge.sort(a);
        Merge.show(a);
    }
}