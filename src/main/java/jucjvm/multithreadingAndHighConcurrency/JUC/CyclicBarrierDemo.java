package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 下午3:45
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> System.out.println("召唤神龙"));
        for (int i = 0; i < 7; i++) {
            final int tem = i;
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " 收集到" + tem);
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
