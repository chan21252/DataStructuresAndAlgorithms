package chapter1.ex1_1_20;

/**
 * 计算ln(!N)
 *
 * @author Chan
 * @since 2020/3/12
 */
public class Ln {
    public static void main(String[] args) {
        System.out.println(ln(3));
    }

    public static double ln(int N) {
        assert N >= 0;
        //0的阶乘是1
        if (N == 1 || N == 0) {
            return 0;
        }

        return Math.log(N) + ln(N - 1);
    }
}