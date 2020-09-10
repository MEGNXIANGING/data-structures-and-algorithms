package jucjvm.multithreadingAndHighConcurrency.TheadPool;

/**
 * @Author: apple
 * @Description:
 *  死锁，a线程持有资源a，想要资源b
 * @Date: 2020/9/10 下午5:24
 */
public class HoldLockDemo  {

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();

        new Thread(()->{
            synchronized (a){
                System.out.println("i get a");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("i want get b");
                synchronized (b){
                    System.out.println("i get b");
                }
            }
        },"A").start();


        new Thread(()->{
            synchronized (b){
                System.out.println("i get b");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("i want get a");
                synchronized (a){
                    System.out.println("i get a");
                }
            }
        },"b").start();

    }
}
