package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 上午11:05
 */
public class ABADemo {
    static AtomicReference<Integer> atomicReference = new AtomicReference(100);
    static AtomicStampedReference<Integer> stampedReference = new AtomicStampedReference<>(100,1);


    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            atomicReference.compareAndSet(100, 101);
            atomicReference.compareAndSet(101, 100);
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(atomicReference.compareAndSet(100, 2019)
                    + "" + atomicReference.get());
        }).start();
    }

}
