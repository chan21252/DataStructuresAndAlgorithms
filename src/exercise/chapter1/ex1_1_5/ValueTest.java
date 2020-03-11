package exercise.chapter1.ex1_1_5;

/**
 * ValueTest
 *
 * @author Chan
 * @since 2020/3/11
 */
public class ValueTest {
    public static void main(String[] args) {
        double x = 0.3;
        double y = 2;
        System.out.println(isBetweenZeroAndOne(x) && isBetweenZeroAndOne(y));
    }

    private static boolean isBetweenZeroAndOne(double x) {
        return x >= 0 && x <= 1;
    }
}
