package jucjvm.multithreadingAndHighConcurrency.volatileModel;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;



/**
 * @Author: apple
 * @Description:
 * 通过CopyOnWriteArrayList 替代 ArrayList
 * 使用lock锁来锁add操作
 * @Date: 2020/9/10 上午11:18
 */
public class NoSafe {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        for (int i = 0; i <3 ; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            }).start();
        }
    }
}
