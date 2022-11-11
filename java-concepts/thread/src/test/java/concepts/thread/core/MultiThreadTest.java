package concepts.thread.core;

import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class MultiThreadTest {
    private MultiThread action;

    @Test
    public void compute(){
        int number = 3;
        int i = 0;
        while(i <= number){
            action = new MultiThread();
            action.start();
            i++;
        }
    }
}
