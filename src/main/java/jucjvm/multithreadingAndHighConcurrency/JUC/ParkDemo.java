package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/13 下午10:07
 */
public class ParkDemo {
    private static Object object = null;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            Thread thread = new Thread(() -> {
                while (object == null) {
                    System.out.println("进入等待");
                    LockSupport.park();
                }
                System.out.println("买到蛋糕了");
            }, "A");
            thread.start();

            Thread.sleep(3000);
            object= new Object();
            LockSupport.unpark(thread);
            System.out.println("生产蛋糕了");
        }
    }
}
