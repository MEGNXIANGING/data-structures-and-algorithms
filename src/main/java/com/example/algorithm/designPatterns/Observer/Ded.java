package com.example.algorithm.designPatterns.Observer;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午3:36
 */
public class Ded implements Observer {
    private void feed(){
        System.out.println("ded  doing");
    }
    private void run(){
        System.out.println("ded  run");
    }
    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        if (event.loc.equals("a")){
            run();
        }else {
            feed();
        }
    }
}
