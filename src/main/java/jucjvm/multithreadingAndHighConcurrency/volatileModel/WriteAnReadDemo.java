package jucjvm.multithreadingAndHighConcurrency.volatileModel;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: apple
 * @Description:
 *          读写锁
 * @Date: 2020/9/10 下午3:09
 */
public class WriteAnReadDemo {

    public static void main(String[] args) {
        MyCache myCache = new MyCache();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(()->{
                myCache.put(finalI +"", finalI +"");
            },String.valueOf(i)).start();
        }

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(()->{
                myCache.get(finalI +"");
            },String.valueOf(i)).start();
        }
    }
}


class MyCache{

    private volatile Map<String,Object> map=new HashMap();
    private ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
    public void put(String key,String value){
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+" 正在写入"+key);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(key,value);
            System.out.println(Thread.currentThread().getName()+" 写入完成");

        }finally {
            lock.writeLock().unlock();
        }
    }
    public void get(String key){
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()+"  正在读取"+key);
            map.get(key);
            System.out.println(Thread.currentThread().getName()+"  读取好了");
        }finally {
            lock.readLock().unlock();
        }


    }



}