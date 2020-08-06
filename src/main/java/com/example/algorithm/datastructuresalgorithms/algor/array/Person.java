package com.example.algorithm.datastructuresalgorithms.algor.array;

import java.util.Objects;

/**
 * @Author: apple
 * @Description: ..
 * @Date: 2020/2/26 下午10:45
 */
public class Person {
    private int age;
    private String userName;

    public Person(int age, String userName) {
        this.age = age;
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println(Thread.currentThread().getName()+"   啊啊啊啊，我死了死的好惨" +super.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(userName, person.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, userName);
    }
}
