package concepts.thread.core;

/**
 * @author Pratyay Ganguli
 */

public class MultiThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
    }
}
