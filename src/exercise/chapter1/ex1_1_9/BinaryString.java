package exercise.chapter1.ex1_1_9;

/**
 * BinaryString
 *
 * @author Chan
 * @since 2020/3/11
 */
public class BinaryString {
    public static void main(String[] args) {
        System.out.println(toBinaryString(1024));
    }

    public static String toBinaryString(int n) {
        String s = "";
        for (int i = n; i > 0; i /= 2) {
            s = (i % 2) + s;
        }

        return s;
    }
}
