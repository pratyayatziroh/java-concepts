package concepts.thread.common;


import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class OperationTest {
    private final Operations operations;
    private static final int NUMBER = 20;

    public OperationTest(){
        operations = new Operations();
    }

    public void printMessage(){
        int i = 1;
        while(i < NUMBER){
             operations.printMessage(i);
             i++;
        }
    }
}
