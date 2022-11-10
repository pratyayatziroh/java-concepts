package concepts.thread.core;

import concepts.thread.common.OperationTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class UserTimeTest {
    private final UserTime userTime;

    public UserTimeTest(){
        userTime = new UserTime();
    }

    @AfterEach
    public void getStartTime(){
        System.out.println(userTime.getTimeStamp());
    }

    @Test
    public void call(){
        new OperationTest().printMessage();
    }

    @BeforeEach
    public void getEndTime(){
        System.out.println(userTime.getTimeStamp());
    }
}
