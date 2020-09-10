package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 下午3:34
 */
public class CountDownDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 0; i <6 ; i++) {
            new Thread(()->{
                countDownLatch.countDown();
                System.out.println("离开");
            }).start();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("关门");
    }



}
