package chapter1.ex1_1_13;

/**
 * ReserveMatrix
 *
 * @author Chan
 * @since 2020/3/12
 */
public class ReserveMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };

        int[][] b = reserve(a);
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] reserve(int[][] a) {
        int M = a.length;
        int N = a[0].length;

        int[][] b = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                b[i][j] = a[j][i];
            }
        }

        return b;
    }
}
