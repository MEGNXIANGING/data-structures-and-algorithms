package jucjvm.multithreadingAndHighConcurrency.TheadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: apple
 * @Description:
 *
 * @Date: 2020/9/10 下午5:14
 */
public class MyTheadPool {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
                (3, 10, 2,
                        TimeUnit.SECONDS, new LinkedBlockingDeque<>(3)
                        , Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        try {
            for (int i = 0; i < 5; i++) {
                threadPoolExecutor.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + " 办理");
                });

            }
        } finally {
            threadPoolExecutor.shutdown();
        }

    }
}
