package concepts.thread.core;

import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

class ExecutorTimeUtilTest {
    private long startTime;
    private long endTime;

    public long getStartTime(){
        return ExecutorTimeUtil.getEpochMilis();
    }

    @Test
    public void call(){

    }

    public long getEndTime(){
        return ExecutorTimeUtil.getEpochMilis();
    }
}
