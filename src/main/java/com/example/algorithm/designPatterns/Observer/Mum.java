package com.example.algorithm.designPatterns.Observer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午3:35
 */
public class Mum implements Observer {
    private void  feed(){
        System.out.println("mum hugging");
    }
    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }
}
