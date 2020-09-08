package com.example.algorithm.designPatterns.Observer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午3:53
 */
public class WakeUpEvent {
    long timestamp; //时间
    String loc;//地点

    public WakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}
