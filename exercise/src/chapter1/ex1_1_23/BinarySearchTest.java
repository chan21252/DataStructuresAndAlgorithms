package chapter1.ex1_1_23;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * BinarySearchTest
 *
 * @author Chan
 * @since 2020/3/13
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        //白名单文件名传入args[0]
        int[] whiteList = In.readInts(args[0]);
        Arrays.sort(whiteList);

        System.out.println("请输入+或者-：");
        String arg = StdIn.readString();

        while (true) {
            System.out.println("输入交易号：");
            int key = StdIn.readInt();
            if (arg.equals("+") && rank(key, whiteList) == -1) {
                System.out.println(key);
            }

            if (arg.equals("-") && rank(key, whiteList) != -1) {
                System.out.println(key);
            }
        }
    }

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
