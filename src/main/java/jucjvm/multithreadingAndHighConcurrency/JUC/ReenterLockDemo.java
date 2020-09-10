package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: apple
 * @Description:
 * 使用的都是class
 * @Date: 2020/9/10 下午2:43
 */
public class ReenterLockDemo {

    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() ->{
            phone.run();
        }).start();

        new Thread(() ->{
            phone.run();
        }).start();
    }
}

class Phone{
    public synchronized void setSmg(){
        System.out.println(Thread.currentThread().getName()+" invoke msg");
        setEmile();
    }

    public synchronized void setEmile(){
        System.out.println(Thread.currentThread().getName()+" invoke emile");
    }
    ReentrantLock lock = new ReentrantLock();

    public  void run(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" invoke run");
            run2();
        }finally {
            lock.unlock();
        }

    }

    public  void run2(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" invoke run2");
        }finally {
            lock.unlock();
        }
    }
}
