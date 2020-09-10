package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 下午4:31
 */
public class PrintShareDemo {
    public static void main(String[] args)throws Exception {
        Share share = new Share();
        new Thread(()->{
            try {
                share.printA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        new Thread(()->{
            try {
                share.printB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

        new Thread(()->{
            try {
                share.printC();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"C").start();
    }
}

class Share {
    private int i = 1;
    private ReentrantLock lock = new ReentrantLock();
    private Condition a = lock.newCondition();
    private Condition b = lock.newCondition();
    private Condition c = lock.newCondition();

    public void printA() throws InterruptedException {
        lock.lock();
        try {
            while (i!=1){
                a.await();
            }
            for (int j = 0; j <5 ; j++) {
                System.out.println(Thread.currentThread().getName()+" 打印"+j);
            }
            i=2;
            b.signal();
        } finally {
            lock.unlock();

        }

    }
    public void printB() throws InterruptedException {
        lock.lock();
        try {
            while (i!=2){
                a.await();
            }
            for (int j = 0; j <10 ; j++) {
                System.out.println(Thread.currentThread().getName()+" 打印"+j);
            }
            i=3;
            c.signal();
        } finally {
            lock.unlock();

        }

    }

    public void printC() throws InterruptedException {
        lock.lock();
        try {
            while (i!=3){
                a.await();
            }
            for (int j = 0; j <15 ; j++) {
                System.out.println(Thread.currentThread().getName()+" 打印"+j);
            }
        } finally {
            lock.unlock();

        }
    }
}