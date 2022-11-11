package concepts.thread.core;

/**
 * @author Pratyay Ganguli
 */

public class ExecutorTimeUtil {
    public static Long getEpochMilis(){
        var time = System.nanoTime() / 1000000;
        return time;
    }

    public static Long getEpochNano(){
        return System.nanoTime();
    }

    public static Long getEpochMicroSeconds(){
        var time = System.nanoTime() / 1000;
        return time;
    }
}
