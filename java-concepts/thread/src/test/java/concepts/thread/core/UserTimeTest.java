package concepts.thread.core;

import concepts.thread.common.OperationTest;
import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class UserTimeTest {
    private final UserTime userTime;
    private long startTime;

    private long endTime;

    public UserTimeTest(){
        userTime = new UserTime();
    }


    public void getStartTime(){
        startTime = userTime.getTimeStamp();
    }

    @Test
    public void call(){
        getStartTime();
        new OperationTest().printMessage();
        getEndTime();
        System.out.println(endTime - startTime + " ms");

    }
    public void getEndTime(){
        endTime = userTime.getTimeStamp();
    }

}
