package chapter1.ex1_1_15;

/**
 * HistogramTest
 *
 * @author Chan
 * @since 2020/3/12
 */
public class HistogramTest {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 2, 3, 3, 5, 6, 7, 9, 9, 9, 9};
        int[] m = histogram(a, 10);

        int sum = 0;
        for (int num : m) {
            System.out.printf("%d ", num);
            sum += num;
        }
        System.out.println();
        System.out.println(sum == a.length);
    }

    public static int[] histogram(int[] a, int M) {
        assert M > 0;

        int[] m = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < M) {
                m[a[i]]++;
            }
        }

        return m;
    }
}
