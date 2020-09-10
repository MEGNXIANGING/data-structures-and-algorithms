package jucjvm.multithreadingAndHighConcurrency.TheadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: apple
 * @Description:
 *  线程池不能复用
 * @Date: 2020/9/10 下午4:53
 */
public class TheadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 10; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName()+" 处理");
                });
            }

        } finally {
            threadPool.shutdown();
        }
    }
}
