package chapter1.ex1_1_24;

/**
 * Euclid
 * 欧几里得算法求最大公约数
 *
 * @author Chan
 * @since 2020/3/13
 */
public class Euclid {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println(gcd(p, q));
    }

    public static int gcd(int p, int q) {
        int remain = p % q;
        if (p % q == 0) {
            return q;
        }

        return gcd(q, remain);
    }
}
