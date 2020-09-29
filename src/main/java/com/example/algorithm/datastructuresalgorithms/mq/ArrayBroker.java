package com.example.algorithm.datastructuresalgorithms.mq;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/29 下午11:49
 */
public class ArrayBroker<E> implements Broker {
    private volatile int offset = 0;

    @Override
    public void produce(Object msg) {
        if (QUEUE.offer(msg)) {
            System.out.println("成功向消息处理中心投递消息：" + msg + "，当前暂存的消息数量是：" + QUEUE.size());
        }else {
            System.out.println("消息处理中心内暂存的消息达到最大负荷，不能继续放入消息！");
        }
        System.out.println("YYYYYYYYYYYY");
    }

    @Override
    public E consume() {
        E msg = (E) QUEUE.poll();
        if (msg != null) {
            // 消费条件满足情况，从消息容器中取出一条消息
            System.out.println("已经消费消息：" + msg + "，当前暂存的消息数量是：" + QUEUE.size());
        } else {
            System.out.println("消息处理中心内没有消息可供消费！");
        }
        System.out.println("=======================");
        return msg;
    }
}
