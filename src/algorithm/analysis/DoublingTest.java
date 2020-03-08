package algorithm.analysis;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @author Chan
 * @since 2020/3/8
 */
public class DoublingTest {
    public static double timerTrial(int N) {
        int MAX = 1000000;
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        int cnt = ThreeSum.count(a);
        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        for (int N = 250; true; N += N) {
            double time = timerTrial(N);
            System.out.printf("%7d %5.1f\n", N, time);
        }

        /*
            250   0.0
            500   0.0
           1000   0.1
           2000   0.5
           4000   3.7
           8000  26.9
          16000 210.1
         */
    }
}
