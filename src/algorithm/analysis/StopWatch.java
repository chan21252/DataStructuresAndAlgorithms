package algorithm.analysis;

import javafx.scene.paint.Stop;

/**
 * 计时器
 *
 * @author Chan
 * @since 2020/3/8
 */
public class StopWatch {

    private final long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();

        return (now - start) / 1000.0;
    }
}
