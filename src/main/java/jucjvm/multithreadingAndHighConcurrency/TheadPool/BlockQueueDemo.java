package jucjvm.multithreadingAndHighConcurrency.TheadPool;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 下午3:58
 */
public class BlockQueueDemo {

    public static void main(String[] args) {
        ShareDemo shareDemo = new ShareDemo();
        for (int i = 0; i < 5; i++) {

            new Thread(() -> {
                shareDemo.add();
            }).start();
        }
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                shareDemo.del();
            }).start();
        }
    }


}

class ShareDemo {
    private int i = 0;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void add() {
        lock.lock();
        try {
            while (i != 0) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            i++;
            System.out.println(Thread.currentThread().getName() + " 加 i=" + i);
            condition.signalAll();
        } finally {
            lock.unlock();
        }


    }

    public void del() {
        lock.lock();
        try {
            while (i == 0) {
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            i--;
            System.out.println(Thread.currentThread().getName() + " 减 i=" + i);

            condition.signalAll();
        } finally {
            lock.unlock();
        }

    }
}
