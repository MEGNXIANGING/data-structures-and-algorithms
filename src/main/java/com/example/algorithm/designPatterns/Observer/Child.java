package com.example.algorithm.designPatterns.Observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/9/8 下午3:38
 */
public class Child {
    private boolean cry=false;
    private WakeUpEvent event;
    private List<Observer> lists=new ArrayList<>();
    {
        lists.add(new Ded());
        lists.add(new Mum());
    }

    public WakeUpEvent getEvent() {
        return event;
    }

    public void setEvent(WakeUpEvent event) {
        this.event = event;
    }

    public void wakeUp(){
        cry=true;
        for (Observer s:lists
             ) {
            s.actionOnWakeUp(event);
        }
    }
}
