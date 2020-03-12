package chapter1.ex1_1_19;

/**
 * Fibonacci
 *
 * @author Chan
 * @since 2020/3/12
 */
public class Fibonacci {
    public static void main(String[] args) {
        long[] a = new long[41];
        F(40, a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(i + " " + a[i]);
        }
    }

    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;

        return F(N - 1) + F(N - 2);
    }

    public static long F(int N, long[] a) {
        if (N == 0) {
            a[0] = 0;
            return 0;
        }
        if (N == 1) {
            a[1] = 1;
            return 1;
        }

        a[N] = F(N - 1, a) + F(N - 2, a);
        return a[N];
    }
}
