package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/13 下午10:17
 */
public class MyLock implements Lock {
    //0 未占用
    private AtomicInteger state = new AtomicInteger();
    private Thread thread = new Thread();
    private LinkedBlockingQueue<Thread> waiters = new LinkedBlockingQueue();

    /**
     * 没有拿到锁就排队
     */
    @Override
    public void lock() {
        if (!tryLock()) {
            //排队
            waiters.add(Thread.currentThread());
            //等待
            while (true) {
                if (tryLock()) {
                  thread=waiters.poll();
                    return;
                } else {
                    LockSupport.park();
                }
            }
        }
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        if (state.get() == 0) {
            //CAS
            if (state.compareAndSet(0, 1)) {
                thread = Thread.currentThread();
                return true;
            }
        }else if (thread ==Thread.currentThread()){
            state.set(state.get()+1);
        }
        return false;
    }

    @Override
    public boolean tryLock(long l, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        if (thread != Thread.currentThread()) {
            throw new RuntimeException("非法调用");
        }
        if (state.decrementAndGet() == 0) {
            thread = null;
            //通知其他线程
            Thread peek = waiters.peek();
            if (peek != null) {
                LockSupport.unpark(peek);
            }
        }

    }

    @Override
    public Condition newCondition() {
        return null;
    }
}
