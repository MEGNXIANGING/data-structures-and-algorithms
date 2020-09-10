package jucjvm.multithreadingAndHighConcurrency.JUC;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: apple
 * @Description:
 *  证明可见性
 * @Date: 2020/9/10 上午9:52
 */
public class volatileDemo {
    public static void main(String[] args) {
        //可见性
        MyDate myDate = new MyDate();
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+" come in");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myDate.setNumber();
            System.out.println(Thread.currentThread().getName()+" update number"+myDate.number);
        },"A").start();

        //main thread
        while (myDate.number==0){

        }
        System.out.println(Thread.currentThread().getName()+" task is complete");
        //证明没有原子性
        for (int i = 0; i < 20; i++) {
            new Thread(()->{
                for (int j = 0; j <1000 ; j++) {
                    myDate.numberPlusAtomic();
                }
            },String.valueOf(i)).start();
        }
        //main线程 和守护线程
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+" number"+myDate.atomicInteger);
    }
}

class MyDate{
     volatile  int number=0;
    public void setNumber(){
        this.number=50;
    }

    public  void numberPlus(){
        this.number++;
    }
    AtomicInteger atomicInteger= new AtomicInteger();
    public void numberPlusAtomic(){
        atomicInteger.getAndIncrement();
    }
}



