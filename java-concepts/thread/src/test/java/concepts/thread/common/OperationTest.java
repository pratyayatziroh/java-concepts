package concepts.thread.common;


import concepts.thread.core.ExecutorTimeUtil;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Pratyay Ganguli
 */

public class OperationTest {
    private final Operations operations;
    private static final int NUMBER = 20;

    public OperationTest(){
        operations = new Operations();
    }

    @Test
    public void sum(){
        var startTime = ExecutorTimeUtil.getEpochMicroSeconds();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(33);
        numbers.add(43);
        numbers.add(53);
        numbers.add(13);
        numbers.add(93);
        numbers.add(22);
        numbers.add(12);
        numbers.add(23);
        numbers.add(33);
        numbers.add(43);
        numbers.add(53);
        numbers.add(13);
        numbers.add(93);
        numbers.add(22);
        numbers.add(12);
        numbers.add(23);
        numbers.add(33);
        numbers.add(43);
        numbers.add(53);
        numbers.add(13);
        numbers.add(93);
        numbers.add(22);
        numbers.add(12);
        operations.summation(numbers);
        var endTime=  ExecutorTimeUtil.getEpochMicroSeconds();
        System.out.println(endTime - startTime + " micro seconds");
    }

    @Test
    public void product(){
    }
}
