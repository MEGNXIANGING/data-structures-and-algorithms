package com.example.algorithm.designPatterns.strategy;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/3 上午12:54
 */
public class Sort {
    public static<T> void sort(T[]a,Comparor comparor){
        T tem;
        for (int i = 0; i < a.length-1 ; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (comparor.compareTo(a[j],a[j+1])==1){
                   tem= a[j+1];
                   a[j+1]=a[j];
                   a[j]=tem;
                }
            }
        }
    }
}
