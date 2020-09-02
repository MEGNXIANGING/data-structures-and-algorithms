package com.example.algorithm.designPatterns.singe;

/**
 * @Author: apple
 * @Description:
 * @Date: 2020/8/31 下午4:53
 */
public class DoubleCheck {
    private volatile static DoubleCheck INSTANCE;
    private DoubleCheck() {
    }

    public static DoubleCheck getInstance(){
        if (INSTANCE==null){
            synchronized (DoubleCheck.class){
                try {
                    Thread.sleep(1);
                }catch (Exception e){

                }
                if (INSTANCE==null){
                    INSTANCE=new DoubleCheck();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->{
                System.out.println(DoubleCheck.getInstance().hashCode());
            }).start();
        }
    }
}
