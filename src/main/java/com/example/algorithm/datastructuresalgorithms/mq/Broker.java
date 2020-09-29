package com.example.algorithm.datastructuresalgorithms.mq;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/29 下午11:19
 */
public interface Broker<E> {
    int MAX_SIZE = 100;

    Queue QUEUE = new ArrayBlockingQueue(MAX_SIZE);

    void produce(E msg);

    E consume();
}
