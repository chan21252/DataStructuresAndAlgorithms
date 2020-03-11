package exercise.chapter1.ex1_1_3;

/**
 * ArgsEqualTest
 *
 * @author Chan
 * @since 2020/3/11
 */
public class ArgsEqualTest {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            equal(a, b, c);
        } catch (Exception e) {
            System.out.println("命令行参数错误");
        }
    }

    private static void equal(int a, int b, int c) {
        boolean equal = (a == b) && (b == c);
        if (equal) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
