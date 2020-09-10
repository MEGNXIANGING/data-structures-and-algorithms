package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 下午3:52
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+" 抢到了🚗位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+" 离开🚗位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                     semaphore.release();
                }
            }).start();
        }


    }
}
