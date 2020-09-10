package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 下午2:58
 */
public class SpinLockDemo {
    AtomicReference<Thread> atomicReference=  new AtomicReference();

    public void myLock(){
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName()+" lock");
        while (!atomicReference.compareAndSet(null,thread)){

        }
    }

    public void unLock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread,null);
        System.out.println(Thread.currentThread().getName()+" unLock");
    }


    public static void main(String[] args) throws InterruptedException {
        SpinLockDemo spinLockDemo = new SpinLockDemo();
        new Thread(()->{
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"a").start();
        TimeUnit.SECONDS.sleep(1);

        new Thread(()->{
            spinLockDemo.myLock();
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"b").start();
    }

}
