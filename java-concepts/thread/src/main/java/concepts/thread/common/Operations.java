package concepts.thread.common;

import java.util.List;

/**
 * @author Pratyay Ganguli
 */

class Operations {
    public void printMessage(int count){
        System.out.println("Printed " + count + " times");
    }

    public int summation(List<Integer> numbers){
        int sum = 0;
        for(var number: numbers){
            sum =  sum + number;
        }
        return sum;
    }

    public int multiplication(List<Integer> numbers){
        int product = 1;
        for(var number : numbers){
            product = product * number;
        }
        return product;
    }
}
