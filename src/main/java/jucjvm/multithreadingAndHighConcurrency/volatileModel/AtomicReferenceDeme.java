package jucjvm.multithreadingAndHighConcurrency.volatileModel;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/10 上午10:58
 */
public class AtomicReferenceDeme {
    public static void main(String[] args) {
        User a = new User("a", 1);
        AtomicReference<User> atomicReference = new AtomicReference();
        System.out.println(atomicReference.compareAndSet(new User("b",1),a=null));

    }
}

class User{
    String name;
    Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}