package com.example.algorithm.datastructuresalgorithms.algor.array;

/**
 * @Author: apple
 * @Description: ..
 * @Date: 2020/2/26 下午4:21
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList();
        arrayList.add(new Person(1,"tom"));
        arrayList.add(new Person(2,"luqi"));
        arrayList.add(new Person(3,"mahan"));
        arrayList.add(new Person(4,"lisifan"));
        arrayList.set(2,new Person(5,"luck"));
        System.out.println(arrayList);
        arrayList.clear();
        System.gc();

    }

}
