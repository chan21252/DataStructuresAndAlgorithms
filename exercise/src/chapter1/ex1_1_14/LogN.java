package chapter1.ex1_1_14;

/**
 * LogN
 *
 * @author Chan
 * @since 2020/3/12
 */
public class LogN {
    public static void main(String[] args) {
        System.out.println(lg2(1024));
    }

    /**
     * 返回小于log2N的最大整数
     *
     * @param N int
     * @return int
     */
    public static int lg(int N) {
        int n = 1;
        int k = 0;

        while (true) {
            // 计算2的k方
            k++;
            n = n * 2;
            if (n > N) {
                return k - 1;
            } else if (n == N) {
                return k;
            }

        }
    }

    /**
     * 返回小于log2N的最大整数
     *
     * @param N int
     * @return int
     */
    public static int lg2(int N) {
        int rightShiftCount = 0;
        do {
            N >>= 1;
            rightShiftCount++;
        } while (N != 0);

        return rightShiftCount - 1;
    }
}
